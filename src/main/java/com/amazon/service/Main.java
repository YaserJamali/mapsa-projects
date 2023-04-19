package com.amazon.service;

import com.amazon.model.Customer;
import com.amazon.model.Item;
import com.amazon.model.Store;
import static com.amazon.service.StoreServices.*;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //In the main method of your program,
    // create a Store object and add some customers and items to it.
    // Then, simulate some purchases by
    // calling the sellItem method with different combinations of customers and items.
    // Finally, print out the final balances and items purchased for each customer.
    public static void main(String[] args) {
        Item shirt=new Item("Shirt",120,5);
        Item sucks=new Item("Sucks",10,30);
        Item shoes=new Item("Shoes",320,2);
        Item pans=new Item("Pans",80,9);
        Item top=new Item("Top",45,15);
        Item hat=new Item("Hat",179.9,12);
        Item gloves=new Item("Gloves",99.9,22);
        Item tie=new Item("Tie",800,3);


        List<Item> aliItems=new ArrayList<>();
        aliItems.add(shirt);aliItems.add(shoes);aliItems.add(hat);

        Customer ali=new Customer("Ali",12000,aliItems);



        List<Item> yaserItems=new ArrayList<>();
        yaserItems.add(gloves);yaserItems.add(pans);aliItems.add(sucks);
        Customer yaser=new Customer("Yaser",500,yaserItems);
//
//        Item[] monaItems={top};
//        Customer mona=new Customer("Mona",5000,monaItems);
//
//        Item[] rezaItems={shirt};
//        Customer reza=new Customer("Reza",1200,rezaItems);
//
//
//        Customer[] armaniCustomers={yaser,ali,mona};
//        Item[] armaniItems={shirt,sucks,pans,gloves,hat,shoes,tie};
//
//
//        Store armani=new Store("Giorgio Armani",armaniItems,armaniCustomers);
//        System.out.println(armani);


        System.out.println(addItem(shirt));
        System.out.println(addCustomer(ali));


    }
}