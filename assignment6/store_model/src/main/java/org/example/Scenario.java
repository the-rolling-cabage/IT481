package org.example;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

    private Integer availableRooms;
    private List<Customer> customersList;

    private DressingRooms dressingRooms;

    public Scenario(Integer availableRooms, Integer customers) throws InterruptedException {
        this.availableRooms = availableRooms;
        DressingRooms dressingRooms1 = new DressingRooms(this.availableRooms);
        this.customersList = requestCustomers(customers);
        dressingRooms1.RequestRoom(customersList);
    }

    private List<Customer> requestCustomers(Integer customers) {
        List<Customer> customers1 = new ArrayList<>();
        for (int i = 0; i < customers; i++) {
            customers1.add(new Customer(0));
        }
        return customers1;
    }

}
