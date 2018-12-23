/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.item;

import java.time.LocalDateTime;

/**
 *
 * @author KamiKoroshi
 */
public class Date {
    
    private Month month;
    private int day;
    private int year;

    public Date(Month month, int days, int year) {
        if (!isValidDate(month, days, year)) {
            System.out.println("This date is invalid.");
            return;
        }
        
        this.month = month;
        this.day = days;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

    private boolean isValidDate(Month month, int days, int year) {
        LocalDateTime now = LocalDateTime.now();
        if (days > (month.isLeap() && isLeapYear(year) ? month.getNrOfDays() + 1 : month.getNrOfDays())) {
            return false;
        } else if (now.getYear() <= year) {
            if (now.getYear() < year) {
                return true;
            } else {
                if (now.getMonthValue() <= month.getValue()) {
                    if (now.getMonthValue() < month.getValue()) {
                        return false;
                    } else {
                        return now.getDayOfMonth() <= days;
                    }
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
}
