package Homework5.store;

public class Supplier implements  Runnable{
    Store store;
    Supplier(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                store.putProduct();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
