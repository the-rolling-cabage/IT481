package com.assignment.demo.controllers;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.services.Employees.Employees;
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
public class EmployeesController {
    private final Employees employees;
    @PostMapping("api/employee")
    public EmployeesDTO createCustomer(@RequestBody LoginRequestDTO requestDTO) throws JsonProcessingException {
        log.info("Received creation request for {}", requestDTO.getUsername());
        return employees.getData(requestDTO);
    }
}
