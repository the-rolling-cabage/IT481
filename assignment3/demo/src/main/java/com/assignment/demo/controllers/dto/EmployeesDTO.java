package com.assignment.demo.controllers.dto;

import com.assignment.demo.repositories.models.EmployeesEntity;
import com.assignment.demo.repositories.models.OrdersEntity;
import com.assignment.demo.services.Employees.Employees;
import lombok.Data;

import java.util.List;

@Data
public class EmployeesDTO {
    private Integer rowCount;
    private List<EmployeesEntity> employeesEntities;
}
