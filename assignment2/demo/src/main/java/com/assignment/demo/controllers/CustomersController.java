package com.assignment.demo.controllers;

import com.assignment.demo.controllers.dto.CustomerCreationRequestDTO;
import com.assignment.demo.services.Customers.Customers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping()
@RestController
public class CustomersController {
    private final Customers clientInterface;
    @PostMapping("api/customer")
    public void createCustomer(@RequestBody CustomerCreationRequestDTO requestDTO) {
        log.info("Received creation request for {}", requestDTO.getContactName());
        clientInterface.addCustomer(requestDTO);
    }

    @GetMapping("api/customer")
    public List<CustomerCreationRequestDTO> listCustomers() {
        return clientInterface.listCustomers();
    }
}
