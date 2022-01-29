package com.squadio.service;

import com.squadio.entity.security.User;
import com.squadio.entity.security.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<User> readAll() {

        return userRepo.findAll();

    }

    public Optional<User> userInfoByName(String userName) {

        Optional<User> users = userRepo.findByUsername(userName);

        return users;

    }
}
