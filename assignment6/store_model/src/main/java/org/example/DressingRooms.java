package org.example;

import java.util.*;
import java.util.concurrent.*;

public class DressingRooms {

    private final Integer rooms;
    ExecutorService threadPoolExecutor;
    CompletionService<Customer.Result> completionService;

    private final Integer avgWaitTime = 0;
    public DressingRooms(Integer rooms) {
        if (rooms != null) {
            this.rooms = rooms;
        } else {
            this.rooms = 3;
        }
        this.threadPoolExecutor = Executors.newFixedThreadPool(3);
        this.completionService = new ExecutorCompletionService<>(threadPoolExecutor);
    }

    public void RequestRoom(List<Customer> customers) throws InterruptedException {
        List<Future<Customer.Result>> results = new ArrayList<>();
        List<Customer.Result> finalResults = new ArrayList<>();
        for (Customer c : customers) {
            results.add(completionService.submit(c));
        }

        int received = 0;
        boolean errors = false;

        while(received < customers.size() && !errors) {
            Future<Customer.Result> resultFuture = completionService.take(); //blocks if none available
            try {
                Customer.Result result = resultFuture.get();
                received ++;
                finalResults.add(result);
            }
            catch(Exception e) {
                errors = true;
            }
        }

        Double avgWaitTime = finalResults.stream()
                .mapToInt(x -> x.timeWaiting).average().getAsDouble();

        Double itemCount = finalResults.stream()
                .mapToInt(x -> x.itemCount).average().getAsDouble();

        Double avgTimePerItem = finalResults.stream()
                .mapToInt(x -> x.avgTimePerItem).average().getAsDouble();

        System.out.println(String.format("avgWaitTime: %s\nitemCount: %s\nTime per item: %s\nNumber of customers: %s\n",
                avgWaitTime,
                itemCount,
                avgTimePerItem,
                finalResults.size()
        ));

    }
}
