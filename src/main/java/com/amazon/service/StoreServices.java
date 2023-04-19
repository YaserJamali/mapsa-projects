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

    private static boolean validateItem(List<Item> itemsInStock, Item item) {
        return itemsInStock.contains(item);
    }

    private static boolean creditChecker(Customer customer, Item item) {

        return customer.getBalance() >= item.getPrice();
    }


    private static void itemUpdater(Item item, int quantity) {
        item.setQuantity(quantity);

    }

    private static void customerUpdater(Customer customer, double balance) {
        customer.setBalance(balance);

    }


    public static Customer sellItem(Customer customer, Item item, Store store) {
        if (store.getItemsInStock().contains(item) && creditChecker(customer, item)
                && addCustomer(customer).contains(customer) && addItem(item).contains(item)) {
            System.out.println();
            double updateBalance = customer.getBalance() - item.getPrice();
            customerUpdater(customer, updateBalance);
            int quantity = item.getQuantity();
            int temp1 = quantity;
            int temp2 = quantity;
            itemUpdater(item, ++temp1);
            store.getItemsInStock().remove(item);
            store.getItemsInStock().add(new Item(item.getName(), item.getPrice(), --temp2));

            return customer;
        }
        System.out.println("Customer "+customer.getName()+" Doesnt Have Enough Money OR The Item Is not In "+store.getName());
        return customer;

    }


}