/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.item;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KamiKoroshi
 */
public class TimeTest {
    
    public TimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Time instance = new Time(12, 20);
        int expResult = 12;
        int result = instance.getHours();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Time instance = new Time(12, 20);
        int expResult = 20;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProperTime method, of class Time.
     */
    @Test
    public void testGetProperTime() {
        System.out.println("getProperTime");
        Time instance = new Time(-10, 0);
        Time expResult = new Time(0, 0);
        assertEquals(expResult, instance);
        
        instance = new Time(10, -120);
        expResult = new Time(8, 0);
        assertEquals(expResult, instance);
    }

    /**
     * Test of equals method, of class Time.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Time(10, 10);
        Time instance = new Time(10, 10);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
        o = new Time(10, 0);
        expResult = false;
        result = instance.equals(o);
        assertEquals(expResult, result);
        
        o = new String();
        expResult = false;
        result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Time.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Time instance = new Time(5, 10);
        String expResult = "05:10";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
