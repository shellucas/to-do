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
public class Item {
    
    private String name;
    private String description;
    private Date dateDue;
    private boolean completed;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(String name, String description, Date dateDue) {
        this.name = name;
        this.description = description;
        this.dateDue = dateDue;
    }
    
    public void changeDateDue(Date date) {
        this.dateDue = date;
    }
    
    public Date getDateDue() {
        return dateDue;
    }

    public void complete() {
        completed = true;
    }
    
    public boolean isCompleted() {
        return completed;
    }

    public void changeDescription(String newDescription) {
        this.description = newDescription;
    } 
    
    public String getDescription() {
        return description;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return name;
    }
    
}
