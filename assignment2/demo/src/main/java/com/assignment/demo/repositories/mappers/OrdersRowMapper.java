package com.assignment.demo.repositories.mappers;

import com.assignment.demo.repositories.models.OrdersEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersRowMapper {
    public OrdersEntity mapRow(ResultSet rs) throws SQLException {
        return OrdersEntity.builder()
                .orderId(rs.getInt("OrderID"))
                .customerId(rs.getString("CustomerID"))
                .employeeId(rs.getInt("EmployeeID"))
                .shipName(rs.getString("ShipName"))
                .shippedDate(rs.getString("ShippedDate"))
                .build();
    }
}
