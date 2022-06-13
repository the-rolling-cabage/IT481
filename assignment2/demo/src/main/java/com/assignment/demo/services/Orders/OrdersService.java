package com.assignment.demo.services.Orders;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.controllers.dto.OrdersDTO;
import com.assignment.demo.repositories.HugeSecurityIssueRepository;
import com.assignment.demo.repositories.TablesEnum;
import com.assignment.demo.repositories.models.EmployeesEntity;
import com.assignment.demo.repositories.models.OrdersEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrdersService implements Orders {
    private final HugeSecurityIssueRepository hugeSecurityIssueRepository = new HugeSecurityIssueRepository();
    ObjectMapper mapper = new ObjectMapper();

    public OrdersDTO getData(LoginRequestDTO loginRequestDTO) throws JsonProcessingException {
        OrdersDTO ordersDTO = new OrdersDTO();
        List<Object> objects = hugeSecurityIssueRepository.makeQuery(loginRequestDTO, TablesEnum.ORDERS);
        List<OrdersEntity> ordersEntities = new ArrayList<>();
        for (Object o : objects) {
            String jsonInString = mapper.writeValueAsString(o);
            OrdersEntity[] entities = mapper.readValue(jsonInString, OrdersEntity[].class);
            ordersEntities.addAll(Arrays.asList(entities));
        }
        ordersDTO.setOrdersEntities(ordersEntities);
        ordersDTO.setRowCount(ordersEntities.size());
        return ordersDTO;
    }
}
