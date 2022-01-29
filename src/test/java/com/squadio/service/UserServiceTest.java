/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.squadio.service;

import com.squadio.entity.security.User;
import java.util.List;
import java.util.Optional;
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
public class UserServiceTest {
    
    public UserServiceTest() {
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
     * Test of readAll method, of class UserService.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        UserService instance = new UserService();
        List<User> expResult = null;
        List<User> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userInfoByName method, of class UserService.
     */
    @Test
    public void testUserInfoByName() {
        System.out.println("userInfoByName");
        String userName = "";
        UserService instance = new UserService();
        Optional<User> expResult = null;
        Optional<User> result = instance.userInfoByName(userName);
        assertEquals(expResult, result);
         
    }
    
}
