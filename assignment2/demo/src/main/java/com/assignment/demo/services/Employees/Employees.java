package com.assignment.demo.services.Employees;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.repositories.models.EmployeesEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface Employees {
    EmployeesDTO getData(LoginRequestDTO loginRequestDTO) throws JsonProcessingException;
}
