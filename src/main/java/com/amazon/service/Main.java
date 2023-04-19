package com.amazon.service;

import com.amazon.model.Customer;
import com.amazon.model.Item;
import com.amazon.model.Store;

import java.util.ArrayList;
import java.util.List;

import static com.amazon.service.StoreServices.addItem;
import static com.amazon.service.StoreServices.sellItem;


public class Main {

    public static void main(String[] args) {


        //*********************
        // * create Items     *
        //*********************
        Item shirt = new Item("Shirt", 120, 2);
        Item shoes = new Item("Shoes", 1000, 8);
        Item pans = new Item("Pans", 80, 10);
        Item gloves = new Item("Pans", 500, 6);

        //**************************
        // * add Items to list     *
        //**************************
        List<Item> yaserItems = new ArrayList<>();

        List<Item> aliItems = new ArrayList<>();
        List<Item> rezaItems = new ArrayList<>();

        addItem(pans);
        addItem(shoes);


        yaserItems.add(shirt);
        yaserItems.add(pans);


        aliItems.add(shirt);
        aliItems.add(shoes);
        aliItems.add(pans);

        rezaItems.add(shirt);
        rezaItems.add(shoes);
        rezaItems.add(gloves);


        //**************************
        // * create customers      *
        //**************************

        Customer yaser = new Customer("Yaser", 500, yaserItems);
        Customer ali = new Customer("Ali", 12000, aliItems);
        Customer reza = new Customer("Reza", 30, rezaItems);


        //***************************
        // * add items to store     *
        //***************************
        List<Item> armaniItems = new ArrayList<>();
        armaniItems.add(shirt);
        armaniItems.add(pans);
        armaniItems.add(shoes);

        //********************************
        // * add customers to store      *
        //********************************
        List<Customer> armaniCustomers = new ArrayList<>();
        armaniCustomers.add(yaser);
        armaniCustomers.add(ali);


        //**************************
        // * create our Store      *
        //**************************
        Store armani = new Store("Giorgio Armani", armaniItems, armaniCustomers);
        System.out.println("***************************************************************************************************************");

        System.out.println(armani.getName() + ": Before Sold " + armani.getItemsInStock());
        System.out.println("***************************************************************************************************************");

        sellItem(yaser, shirt, armani);
        System.out.println(yaser.getName() + " Balance Updated: " + yaser.getBalance() + " Quantity Updated: " + yaser.getItemsPurchased());
        System.out.println("***************************************************************************************************************");

        sellItem(ali, shoes, armani);
        System.out.println(ali.getName() + " Balance Updated: " + ali.getBalance() + " Quantity Updated: " + ali.getItemsPurchased());
        System.out.println("***************************************************************************************************************");


        sellItem(yaser, pans, armani);
        System.out.println(yaser.getName() + " Balance Updated: " + yaser.getBalance() + " Quantity Updated: " + yaser.getItemsPurchased());
        System.out.println("***************************************************************************************************************");

        sellItem(reza,gloves,armani);
        System.out.println("***************************************************************************************************************");

        System.out.println(reza.getName() + " Balance Updated: " + reza.getBalance() + " Quantity Updated: " + reza.getItemsPurchased());
        System.out.println("***************************************************************************************************************");


        System.out.println("\n"+armani.getName() + ": After Sold " + armani.getItemsInStock());


    }
}