package com.assignment.demo.controllers;

import com.assignment.demo.controllers.dto.CustomerCreationRequestDTO;
import com.assignment.demo.services.ClientInterface;
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
public class Employees {

    private final ClientInterface clientInterface;
    @PostMapping("api/employee")
    public void createCustomer(@RequestBody CustomerCreationRequestDTO requestDTO) {
        log.info("Received creation request for {}", requestDTO.getContactName());
        clientInterface.addCustomer(requestDTO);
    }
}
