package com.assignment.demo.services;

import com.assignment.demo.controllers.dto.CustomerCreationRequestDTO;
import com.assignment.demo.repositories.CustomerRepository;
import com.assignment.demo.repositories.models.Customers;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ClientService implements ClientInterface {

    private final CustomerRepository customerRepository;

    @Override
    public void addCustomer(CustomerCreationRequestDTO customerCreationRequestDTO) {
        Customers newObject = new Customers();
        /*
        So I know this is a little... magical but what's happening here is really cool.
        In this single function we are actually setting all values that have the same names between two objects of different types.
        THIS ONE LINE is a miracle for any job that needs a solid ETL between objects.
        * */
        BeanUtils.copyProperties(customerCreationRequestDTO, newObject);
        newObject.setCustomerId(UUID.randomUUID().toString().substring(0, 5));
        try {
            customerRepository.save(newObject);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to process customer creation at this time. Please try again later.");
        }
    }

    @Override
    public List<CustomerCreationRequestDTO> listCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(), true)
                .map(customer -> {
                    CustomerCreationRequestDTO customerRequest = new CustomerCreationRequestDTO();
                    BeanUtils.copyProperties(customer, customerRequest);
                    return customerRequest;
                })
                .collect(Collectors.toList());
    }
}
