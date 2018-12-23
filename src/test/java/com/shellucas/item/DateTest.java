/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.item;

import java.time.LocalDateTime;
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
public class DateTest {

    public DateTest() {
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

    @Test
    public void testDate() {
        LocalDateTime now = LocalDateTime.now();
        int currentYear = now.getYear();
        Month currentMonth = Month.getMonth(now.getMonthValue());
        int currentDay = now.getDayOfMonth();

        int day = 40;
        int year = currentYear + 1;
        Month month = Month.MARCH;

        Date instance = new Date(month, day, year);
        assertNull(instance.getMonth());

        day = 30;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());

        year = currentYear - 1;
        day = currentDay;
        instance = new Date(month, day, year);
        assertNull(instance.getMonth());

        year = currentYear + 1;
        day = 28;
        month = Month.FEBRUARY;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());

        day = 29;
        year = currentYear % 4 == 0 ? currentYear + 4 : currentYear - (currentYear % 4) + 4;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());

        year = currentYear - (currentYear % 400) + 400;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());

        day = 20;
        year = currentYear + 1;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());
        
        year = currentYear + 20;
        month = Month.getMonth(currentMonth.getValue() - 24);
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());
        
        year = currentYear;
        instance = new Date(month, day, year);
        assertNull(instance.getMonth());
        
        instance = new Date(month, day, year);
        assertNull(instance.getMonth());
        
        month = Month.getMonth(currentMonth.getValue()+1);
        instance = new Date(month, day, year);
        assertNull(instance.getMonth());
        
        day = currentDay;
        month = currentMonth;
        instance = new Date(month, day, year);
        assertNotNull(instance.getMonth());
        
        assertEquals(month, instance.getMonth());
        assertEquals(day, instance.getDay());
        assertEquals(year, instance.getYear());
        assertEquals(day + "/" + month + "/" + year, instance.toString());
    }

}
