package com.amazon.model;

import com.google.gson.Gson;

import java.util.List;

public class Store {

    private String name;

    private List <Item> itemsInStock;

    private List<Customer> customers;

    public Store() {
    }

    public Store(String name, List<Item> itemsInStock, List<Customer> customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(List<Item> itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
