package com.assignment.demo.controllers;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.controllers.dto.OrdersDTO;
import com.assignment.demo.services.Employees.Employees;
import com.assignment.demo.services.Orders.Orders;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping()
@RestController
public class OrdersController {
    private final Orders orders;
    @PostMapping("api/orders")
    public OrdersDTO getCustomerData(@RequestBody LoginRequestDTO requestDTO) throws JsonProcessingException {
        log.info("Received creation request for {}", requestDTO.getUsername());
        return orders.getData(requestDTO);
    }
}
