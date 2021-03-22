package Homework5.store;

public class Store {
    private int productCount;

    Store(int productCount) {
        this.productCount = productCount;
    }
    synchronized void getProduct() {
        if(productCount < 1 ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            productCount--;
            System.out.println("1 product getted, " + productCount + " left");
            notify();
        }
    }

    synchronized void  putProduct() {
        if(productCount>0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            productCount+=10;
            System.out.println("10 product putted, " +productCount+ " awailable");
            notify();
        }

    }

}