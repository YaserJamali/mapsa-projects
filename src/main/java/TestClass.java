//import com.amazon.model.Customer;
//import com.amazon.model.Item;
//import com.amazon.model.Store;
//
//public class TestClass {
//
//    public static boolean creditChecker(Customer customer, Item item) {
//
//        return customer.getBalance() >= item.getPrice();
//    }
//
////    public static void testOk(Customer customer, Item item, Store store) {
////        //his method should first check if the item is in stock and if the customer
////        // has enough money to buy it. If both of these conditions are true,
////        // the item should be removed from the list of items in stock and added to
////        // the customer's list of items purchased.
////        // The customer's balance should be updated
////
////        Customer updateCustomer = customer;
////        if (validateItem(store.getItemsInStock(), item) && creditChecker(customer, item)) {
////
////            System.out.println("ok");
////
////            int length = Math.min(customer.getItemsPurchased().size(), store.getItemsInStock().size());
////
////            double updateBalance = customer.getBalance() - item.getPrice();
////            int j = 0;
////
////
//////            for (int i = 0; i < length; i++) {
////            if (store.getItemsInStock().contains(item)) {
////                System.out.println("");
////                store.getItemsInStock().remove(item);
////                customer.getItemsPurchased().remove(item);
////                store.getItemsInStock().add(new Item(item.getName(), item.getPrice(), (item.getQuantity() - 1)));
////
////                customer.getItemsPurchased().add(new Item(item.getName(), item.getPrice(), (item.getQuantity() + 1)));
////
////                store.getCustomers().remove(customer);
////                store.getCustomers().add(new Customer(customer.getName(), updateBalance, customer.getItemsPurchased()));
////                System.out.println(updateBalance);
////                System.out.println("for");
////                updateCustomer = new Customer(customer.getName(), updateBalance, customer.getItemsPurchased());
////
////            } else customer.getItemsPurchased().add(new Item(item.getName(), item.getPrice(), (++j)));
////
////            System.out.println(store);
////            System.out.println(length);
////
////            System.out.println("*************");
////
////            System.out.println(updateCustomer);
////
////
////        } else System.out.println("not ok");
////    }
//
//    public static void test1(Customer customer, Item item, Store store) {
//        if (validateItem(store.getItemsInStock(), item) && creditChecker(customer, item)) {
//            System.out.println("ok");
//            double updateBalance = customer.getBalance() - item.getPrice();
//            customerUpdater(customer, updateBalance);
//            int quantity = item.getQuantity();
//            itemUpdater(item, ++quantity);
//            System.out.println(customer);
////            itemUpdater(item, quantity);
//        }
//
//    }
//
//}
//    public static void testOk(Customer customer, Item item, Store store) {
//        //his method should first check if the item is in stock and if the customer
//        // has enough money to buy it. If both of these conditions are true,
//        // the item should be removed from the list of items in stock and added to
//        // the customer's list of items purchased.
//        // The customer's balance should be updated
//
//        Customer updateCustomer = customer;
//        if (validateItem(store.getItemsInStock(), item) && creditChecker(customer, item)) {
//
//            System.out.println("ok");
//
//            int length = Math.min(customer.getItemsPurchased().size(), store.getItemsInStock().size());
//
//            double updateBalance = customer.getBalance() - item.getPrice();
//            int j = 0;
//
//
////            for (int i = 0; i < length; i++) {
//            if (store.getItemsInStock().contains(item)) {
//                System.out.println("");
//                store.getItemsInStock().remove(item);
//                customer.getItemsPurchased().remove(item);
//                store.getItemsInStock().add(new Item(item.getName(), item.getPrice(), (item.getQuantity() - 1)));
//
//                customer.getItemsPurchased().add(new Item(item.getName(), item.getPrice(), (item.getQuantity() + 1)));
//
//                store.getCustomers().remove(customer);
//                store.getCustomers().add(new Customer(customer.getName(), updateBalance, customer.getItemsPurchased()));
//                System.out.println(updateBalance);
//                System.out.println("for");
//                updateCustomer = new Customer(customer.getName(), updateBalance, customer.getItemsPurchased());
//
//            } else customer.getItemsPurchased().add(new Item(item.getName(), item.getPrice(), (++j)));
//
//            System.out.println(store);
//            System.out.println(length);
//
//            System.out.println("*************");
//
//            System.out.println(updateCustomer);
//
//
//        } else System.out.println("not ok");
//    }

//    public static void test1(Customer customer, Item item, Store store) {
//        if (validateItem(store.getItemsInStock(), item) && creditChecker(customer, item)) {
//            System.out.println("ok");
//            double updateBalance = customer.getBalance() - item.getPrice();
//            customerUpdater(customer, updateBalance);
//            int quantity = item.getQuantity();
//            itemUpdater(item, ++quantity);
//            System.out.println(customer);
////            itemUpdater(item, quantity);
//        }
//
//    }
//    public static void sellItem(Customer customer, Item item, Store store) {
//        //his method should first check if the item is in stock and if the customer
//        // has enough money to buy it. If both of these conditions are true,
//        // the item should be removed from the list of items in stock and added to
//        // the customer's list of items purchased.
//        // The customer's balance should be updated
//
//        Customer updateCustomer = customer;
//        if (validateItem(store.getItemsInStock(), item) && creditChecker(customer, item)) {
//
//            System.out.println("ok");
//
//            int length = Math.min(customer.getItemsPurchased().size(), store.getItemsInStock().size());
//
//
//            for (int i = 0; i < length; i++) {
//                if (store.getItemsInStock().get(i) == item) {
//                    System.out.println("");
//                    store.getItemsInStock().remove(item);
//                    if (item.getQuantity() == 1) {
//                        System.out.println("item completely removed");
//                    } else {
//                        store.getItemsInStock().add(new Item(item.getName(), item.getPrice(), (item.getQuantity() - 1)));
//                    }
//                    customer.getItemsPurchased().remove(item);
//                    customer.getItemsPurchased().add(new Item(item.getName(), item.getPrice()));
//
//                    store.getCustomers().remove(customer);
//                    double updateBalance = customer.getBalance() - item.getPrice();
//                    store.getCustomers().add(new Customer(customer.getName(), updateBalance, customer.getItemsPurchased()));
//                    System.out.println(updateBalance);
//                    System.out.println("for");
//                    updateCustomer = new Customer(customer.getName(), updateBalance, customer.getItemsPurchased());
//
//                }
//            }
//            System.out.println(store);
//            System.out.println(length);
//
//            System.out.println("*************");
//
//            System.out.println(updateCustomer);
//
//
//        } else System.out.println("not ok");
////        return new Customer();
//    }

//
//
//
//        List<Item> yaserItems = new ArrayList<>();
//        yaserItems.add(shirt);
//        yaserItems.add(pans);
//        yaserItems.add(sucks);
//        Customer yaser = new Customer("Yaser", 500, yaserItems);

//        List<Item> monaItems=new ArrayList<>();
//        monaItems.add(top);
//        Customer mona=new Customer("Mona",5000,monaItems);
//
//        List<Item> rezaItems=new ArrayList<>();
//        rezaItems.add(shirt);
//        rezaItems.add(hat);
//        rezaItems.add(gloves);
//        Customer reza=new Customer("Reza",1200,rezaItems);
//        armaniCustomers.add(mona);
//        armaniCustomers.add(reza);

//        armaniItems.add(gloves);
//        armaniItems.add(hat);
//        armaniItems.add(shoes);
//        armaniItems.add(tie);

//        System.out.println(armani);

//
//        System.out.println(addItem(shirt));
//        System.out.println(addCustomer(ali));
//
//        System.out.println(validateItem(armaniItems,shirt));
//
//        System.out.println(creditChecker(yaser,shirt));
