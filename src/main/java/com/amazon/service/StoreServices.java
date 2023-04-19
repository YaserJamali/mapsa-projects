package com.amazon.service;

import com.amazon.model.Customer;
import com.amazon.model.Item;
import com.amazon.model.Store;

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

    public static boolean validateItem(List<Item> itemsInStock, Item item) {
        return itemsInStock.contains(item);
    }

    public static boolean creditChecker(Customer customer, Item item) {

        return customer.getBalance() >= item.getPrice();
    }



    public static Item itemUpdater(Item item, int quantity) {
        item.setQuantity(quantity);
        return item;

    }

    public static void customerUpdater(Customer customer, double balance) {
        customer.setBalance(balance);

    }



    public static Customer sellItem(Customer customer, Item item) {
        if (validateItem(addItem(item), item) && creditChecker(customer, item)) {
            System.out.println();
            double updateBalance = customer.getBalance() - item.getPrice();
            customerUpdater(customer, updateBalance);
            int quantity = item.getQuantity();
            itemUpdater(item, ++quantity);
            return customer;
        }
        return customer;

    }


}