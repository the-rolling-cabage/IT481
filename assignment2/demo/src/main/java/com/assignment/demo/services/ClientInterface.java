package com.assignment.demo.services;

import com.assignment.demo.controllers.dto.CustomerCreationRequestDTO;

import java.util.List;

public interface ClientInterface {
    void addCustomer(CustomerCreationRequestDTO customerCreationRequestDTO);
    List<CustomerCreationRequestDTO> listCustomers();
}
