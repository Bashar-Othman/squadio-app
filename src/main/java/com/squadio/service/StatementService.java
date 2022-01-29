/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.squadio.service;

import com.squadio.entity.Statement;
import com.squadio.entity.repository.StatementRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BasharOthman
 */
@Service
public class StatementService {

    @Autowired
    private StatementRepo statementRepo;

    public List<Statement> statementsByAccountId(String accountId) {

        return statementRepo.findByAccountId(accountId);

    }
}
