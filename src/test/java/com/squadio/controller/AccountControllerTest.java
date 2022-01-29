/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.squadio.controller;

import com.squadio.entity.Account;
import com.squadio.entity.Statement;
import com.squadio.model.StatementModel;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author BasharOthman
 */
public class AccountControllerTest {

    public AccountControllerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of account method, of class AccountController.
     */
    @Test
    public void testAccount() {
        System.out.println("account");
        String userId = "";
        AccountController instance = new AccountController();
        ResponseEntity<List<Account>> expResult = null;
        ResponseEntity<List<Account>> result = instance.account(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of statements method, of class AccountController.
     */
    @Test
    public void testStatements() {
        System.out.println("statements");
        StatementModel statementModel = null;
        AccountController instance = new AccountController();
        ResponseEntity<List<Statement>> expResult = null;
        ResponseEntity<List<Statement>> result = instance.statements(statementModel);
        assertEquals(expResult, result);

    }

}
