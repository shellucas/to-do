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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of addDateDue method, of class Item.
     */
    @Test
    public void testChangeDateDue() {
        System.out.println("changeDateDue");
        Date date = new Date(Month.MARCH, 20, 2200);
        Item instance = new Item("Finish to-do application", "Title");
        assertNull(instance.getDateDue());
        
        instance.changeDateDue(date);
        assertNotNull(instance.getDateDue());
        assertEquals(date, instance.getDateDue());
        
        instance = new Item("Finish to-do application", "Title", date);
        assertNotNull(instance.getDateDue());
        assertEquals(date, instance.getDateDue());
        
        date = new Date(Month.MARCH, 21, 2200);
        instance.changeDateDue(date);
        assertNotNull(instance.getDateDue());
        assertEquals(date, instance.getDateDue());
        
    }

    /**
     * Test of complete method, of class Item.
     */
    @Test
    public void testComplete() {
        System.out.println("complete");
        Item instance = new Item("", "");
        
        assertFalse(instance.isCompleted());
        
        instance.complete();
        assertTrue(instance.isCompleted());
    }

    /**
     * Test of changeDescription method, of class Item.
     */
    @Test
    public void testChangeDescription() {
        System.out.println("changeDescription");
        String newDescription = "Hello";
        Item instance = new Item("Hi", "Description");
        
        assertEquals("Description", instance.getDescription());
        
        instance.changeDescription(newDescription);
        assertEquals(newDescription, instance.getDescription());
    }

    /**
     * Test of changeName method, of class Item.
     */
    @Test
    public void testChangeName() {
        System.out.println("changeName");
        String newName = "Hello";
        Item instance = new Item("Hi", "Description");
        
        assertEquals("Description", instance.getDescription());
        
        instance.changeName(newName);
        assertEquals(newName, instance.getName());
    }
    
}
