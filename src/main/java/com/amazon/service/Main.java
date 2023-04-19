package com.amazon.service;

import com.amazon.model.Customer;
import com.amazon.model.Item;
import com.amazon.model.Store;

import java.util.ArrayList;
import java.util.List;

import static com.amazon.service.StoreServices.addItem;
import static com.amazon.service.StoreServices.sellItem;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //In the main method of your program,
    // create a Store object and add some customers and items to it.
    // Then, simulate some purchases by
    // calling the sellItem method with different combinations of customers and items.
    // Finally, print out the final balances and items purchased for each customer.
    public static void main(String[] args) {


        //*********************
        // * create Items     *
        //*********************
        Item shirt = new Item("Shirt", 120,2);
        Item shoes = new Item("Shoes", 1000,8);
        Item pans = new Item("Pans", 80,10);

        //**************************
        // * add Items to list     *
        //**************************
        List<Item> yaserItems = new ArrayList<>();

        List<Item> aliItems=new ArrayList<>();

        addItem(pans);
        addItem(shoes);


        yaserItems.add(shirt);
        yaserItems.add(pans);


        aliItems.add(shirt);
        aliItems.add(shoes);
        aliItems.add(pans);

        //**************************
        // * create customers      *
        //**************************

        Customer yaser = new Customer("Yaser", 500, yaserItems);
        Customer ali=new Customer("Ali",12000,aliItems);

        //***************************
        // * add items to store     *
        //***************************
        List<Item> armaniItems=new ArrayList<>();
        armaniItems.add(shirt);
        armaniItems.add(pans);

        //********************************
        // * add customers to store      *
        //********************************
        List<Customer> armaniCustomers=new ArrayList<>();
        armaniCustomers.add(yaser);
        armaniCustomers.add(ali);


        //**************************
        // * create our Store      *
        //**************************
        Store armani=new Store("Giorgio Armani",armaniItems,armaniCustomers);
        System.out.println(armani);

        System.out.println(sellItem(yaser, shirt));
        System.out.println();
        System.out.println(sellItem(ali, pans));
        System.out.println();
        System.out.println(sellItem(yaser,shirt));
        System.out.println();
        System.out.println(sellItem(ali, shoes));
        System.out.println();



    }
}