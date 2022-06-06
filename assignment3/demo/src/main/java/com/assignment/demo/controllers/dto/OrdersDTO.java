package com.assignment.demo.controllers.dto;

import com.assignment.demo.repositories.models.EmployeesEntity;
import com.assignment.demo.repositories.models.OrdersEntity;
import lombok.Data;

import java.util.List;

@Data
public class OrdersDTO {
    private Integer rowCount;
    private List<OrdersEntity> ordersEntities;
}
