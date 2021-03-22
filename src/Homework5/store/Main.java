package Homework5.store;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(10);
        Thread customer = new Thread(new Customer(store),"customer");
        Thread supplier  = new Thread(new Supplier(store),"supplier");
        customer.start();
        supplier.start();
    }
}
