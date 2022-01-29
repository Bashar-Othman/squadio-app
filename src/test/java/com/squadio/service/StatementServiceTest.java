/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.squadio.service;

import com.squadio.entity.Statement;
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
public class StatementServiceTest {
    
    public StatementServiceTest() {
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
     * Test of statementsByAccountId method, of class StatementService.
     */
    @Test
    public void testStatementsByAccountId() {
        System.out.println("statementsByAccountId");
        String accountId = "";
        StatementService instance = new StatementService();
        List<Statement> expResult = null;
        List<Statement> result = instance.statementsByAccountId(accountId);
        assertEquals(expResult, result);
       
    }
    
}
