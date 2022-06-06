package com.assignment.demo.services.Customers;

import com.assignment.demo.controllers.dto.CustomerCreationRequestDTO;

import java.util.List;

public interface Customers {
    void addCustomer(CustomerCreationRequestDTO customerCreationRequestDTO);
    List<CustomerCreationRequestDTO> listCustomers();
}
