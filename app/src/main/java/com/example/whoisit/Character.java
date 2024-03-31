package com.example.whoisit;

public class Character {
    String name;
    boolean bald;
    boolean hat;
    boolean blonde;

    public Character(String name, boolean bald, boolean hat, boolean blonde) {
        this.name = name;
        this.bald = bald;
        this.hat = hat;
        this.blonde = blonde;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBald() {
        return bald;
    }

    public void setBald(boolean bald) {
        this.bald = bald;
    }

    public boolean isHat() {
        return hat;
    }

    public void setHat(boolean hat) {
        this.hat = hat;
    }

    public boolean isBlonde() {
        return blonde;
    }

    public void setBlonde(boolean blonde) {
        this.blonde = blonde;
    }
}
