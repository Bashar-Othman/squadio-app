package com.squadio.controller;

import com.squadio.config.security.ControllerSecurityUtil;
import com.squadio.entity.security.User;
import com.squadio.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BasharOthman
 */
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UserService userService;
    
    @Autowired
    ControllerSecurityUtil controllerSecurityUtil;

    @GetMapping
    @PreAuthorize("hasAuthority('admin')")
    public ResponseEntity<List<User>> users() {

        List<User> users = userService.readAll();

        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @GetMapping("/{username}")
    @PreAuthorize("hasAuthority('admin') or hasAuthority('user')")
    public ResponseEntity<Optional<User>> user(@PathVariable("username") String userName) {

        if (!controllerSecurityUtil.isAllowed(userName)) {

            return new ResponseEntity<Optional<User>>(HttpStatus.FORBIDDEN);

        }
        Optional<User> users = userService.userInfoByName(userName);

        return new ResponseEntity<Optional<User>>(users, HttpStatus.OK);
    }

}
