package org.example;

import java.util.Random;
import java.util.concurrent.Callable;

public class Customer implements Callable<Customer.Result> {

    private Integer numberOfItems;

    public Customer(Integer numberOfItems) {
        switch (numberOfItems) {
            case 0 -> this.numberOfItems = clothingSelector();
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ->
                    this.numberOfItems = numberOfItems;
        }
    }
    private Integer clothingSelector() {
        Random rand = new Random();
        int rand_int = rand.nextInt(19);
        rand_int += 1;
        return rand_int;
    }

    private Integer avgTimePerItem() {
        Random rand = new Random();
        int rand_int = rand.nextInt(19);
        rand_int += 1;
        return rand_int;
    }

    private Integer avgWaitPerCustomer() {
        Random rand = new Random();
        int rand_int = rand.nextInt(19);
        rand_int += 1;
        return rand_int;
    }

    @Override
    public Result call() throws Exception {
        Result result = new Result();
        result.avgTimePerItem = avgTimePerItem();
        result.itemCount = this.numberOfItems;
        result.timeWaiting = avgWaitPerCustomer();
        return result;
    }

    public static class Result {
        public Integer itemCount;
        public Integer avgTimePerItem;
        public Integer timeWaiting;
    }
}
