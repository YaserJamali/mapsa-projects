package com.amazon.service;

import com.amazon.model.Customer;
import com.amazon.model.Item;

import java.util.ArrayList;
import java.util.List;

public class StoreServices {
    protected static List<Customer> addCustomer(Customer customer) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        return customerList;
    }

    protected static List<Item> addItem(Item item) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(item);
        return itemList;
    }

    Customer sellItem(Customer customer, Item item) {
        //his method should first check if the item is in stock and if the customer
        // has enough money to buy it. If both of these conditions are true,
        // the item should be removed from the list of items in stock and added to
        // the customer's list of items purchased.
        // The customer's balance should be updated


        return new Customer();
    }

}
