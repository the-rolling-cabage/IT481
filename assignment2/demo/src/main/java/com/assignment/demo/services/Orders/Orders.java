package com.assignment.demo.services.Orders;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.controllers.dto.OrdersDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface Orders {
    OrdersDTO getData(LoginRequestDTO loginRequestDTO) throws JsonProcessingException;
}
