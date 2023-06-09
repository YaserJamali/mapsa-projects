package com.amazon.model;


import com.google.gson.Gson;

import java.util.List;

public class Customer {

    private String name;
    private double balance;
    private List<Item> itemsPurchased;

    public Customer() {
    }

    public Customer(String name, double balance, List<Item> itemsPurchased) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Item> getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(List<Item> itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
