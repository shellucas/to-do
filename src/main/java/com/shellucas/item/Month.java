/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.item;

/**
 *
 * @author KamiKoroshi
 */
public enum Month {
    
    JANUARI(31, false, 1),
    FEBRUARY(28, true, 2),
    MARCH(31, false, 3),
    APRIL(30, false, 4),
    MAY(31, false, 5),
    JUNE(30, false, 6),
    JULY(31, false, 7),
    AUGUST(31, false, 8),
    SEPTEMBER(30, false, 9),
    OCTOBER(31, false, 10),
    NOVEMBER(30, false, 11),
    DECEMBER(31, false, 12);

    private final int nrOfDays;
    private final boolean leap;
    private final int value;
    
    private Month(int nrOfDays, boolean leap, int value) {
        this.nrOfDays = nrOfDays;
        this.leap = leap;
        this.value = value;
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    public boolean isLeap() {
        return leap;
    }

    public int getValue() {
        return value;
    }
    
    public static Month getMonth(int value) {
        Month[] months = Month.values();
        int length = months.length;
        if (value <= 0 || value > Month.values().length) {
            if (value <= 0) {
                return getMonth(length + value);
            } else {
                return getMonth(value % length);
            }
        }
        return months[value-1];
    }
    
}
