/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.squadio.controller;

import com.squadio.entity.security.User;
import java.util.List;
import java.util.Optional;
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
public class UsersControllerTest {

    public UsersControllerTest() {
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
     * Test of users method, of class UsersController.
     */
    @Test
    public void testUsers() {
        System.out.println("users");
        UsersController instance = new UsersController();
        ResponseEntity<List<User>> expResult = null;
        ResponseEntity<List<User>> result = instance.users();
        assertEquals(expResult, result);
    }

    /**
     * Test of user method, of class UsersController.
     */
    @Test
    public void testUser() {
        System.out.println("user");
        String userName = "";
        UsersController instance = new UsersController();
        ResponseEntity<Optional<User>> expResult = null;
        ResponseEntity<Optional<User>> result = instance.user(userName);
        assertEquals(expResult, result);

    }

}
