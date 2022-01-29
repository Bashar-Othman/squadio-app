package com.squadio.controller;

import com.squadio.config.security.ControllerSecurityUtil;
import com.squadio.entity.Account;
import com.squadio.entity.Statement;
import com.squadio.model.StatementModel;
import com.squadio.service.AccountService;
import com.squadio.service.StatementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BasharOthman
 */
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private StatementService statementService;

    @Autowired
    ControllerSecurityUtil controllerSecurityUtil;

    @GetMapping("/{user-id}")
    @PreAuthorize("hasAuthority('admin') or hasAuthority('user')")
    public ResponseEntity<List<Account>> account(@PathVariable("user-id") String userId) {

        if (!controllerSecurityUtil.isAllowed(userId)) {

            return new ResponseEntity<>(HttpStatus.FORBIDDEN);

        }
        List<Account> accounts = accountService.accountByUserId(userId);

        return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
    }

    @PostMapping("/statements")
    @PreAuthorize("hasAuthority('admin') or hasAuthority('user')")

    public ResponseEntity<List<Statement>> statements(@RequestBody StatementModel statementModel) {

        if (!controllerSecurityUtil.isAllowed(statementModel.getAccountId())) {

            return new ResponseEntity<>(HttpStatus.FORBIDDEN);

        }

        System.out.println("Statements by Account ID : " + statementModel.getAccountId());
        List<Statement> statements = statementService.statementsByAccountId(statementModel.getAccountId());

        return new ResponseEntity<List<Statement>>(statements, HttpStatus.OK);
    }
}
