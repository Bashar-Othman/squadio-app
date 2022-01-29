package com.squadio.service;

import com.squadio.entity.Account;
import com.squadio.entity.Statement;

import com.squadio.entity.repository.AccountRepo;
import com.squadio.entity.repository.StatementRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    public List<Account> readAll() {

        return accountRepo.findAll();

    }

    public List<Account> accountByUserId(String userId) {

        return accountRepo.findByUserid(userId);

    }

}
