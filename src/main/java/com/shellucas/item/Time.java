/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellucas.item;

import java.text.DecimalFormat;

/**
 *
 * @author KamiKoroshi
 */
public class Time {
    
    private final int hours;
    private final int minutes;

    public Time(int hours, int minutes) {
        if (minutes < 0 || minutes >= 60 || hours < 0 || hours >= 24) {
            Time time = getProperTime(hours, minutes);
            this.hours = time.getHours();
            this.minutes = time.getMinutes();
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }
    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public static Time getProperTime(int hrs, int mts) {
        mts = hrs * 60 + mts;
        if (mts <= 0) {
            return new Time(0, 0);
        } else {
            return new Time((mts / 60) % 24, mts % 60);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Time) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.hours;
        hash = 71 * hash + this.minutes;
        return hash;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hours) + ":" + df.format(minutes);
    }
    
}
