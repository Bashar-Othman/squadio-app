/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.squadio.service;

import com.squadio.entity.Account;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BasharOthman
 */
public class AccountServiceTest {

    public AccountServiceTest() {
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
     * Test of readAll method, of class AccountService.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        AccountService instance = new AccountService();
        List<Account> expResult = null;
        List<Account> result = instance.readAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of accountByUserId method, of class AccountService.
     */
    @Test
    public void testAccountByUserId() {
        System.out.println("accountByUserId");
        String userId = "";
        AccountService instance = new AccountService();
        List<Account> expResult = null;
        List<Account> result = instance.accountByUserId(userId);
        assertEquals(expResult, result);

    }

}
