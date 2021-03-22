package Homework5.store;

public class Customer implements Runnable {
    Store store;
    Customer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true){
            try {
                store.getProduct();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}