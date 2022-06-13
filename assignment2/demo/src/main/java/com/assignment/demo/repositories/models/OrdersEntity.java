package com.assignment.demo.repositories.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Orders", schema = "dbo", catalog = "Northwind")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "CustomerID", nullable = true, length = 5)
    private String customerId;
    @Basic
    @Column(name = "EmployeeID", nullable = true)
    private Integer employeeId;
    @Basic
    @Column(name = "OrderDate", nullable = true)
    private String orderDate;
    @Basic
    @Column(name = "RequiredDate", nullable = true)
    private String requiredDate;
    @Basic
    @Column(name = "ShippedDate", nullable = true)
    private String shippedDate;
    @Basic
    @Column(name = "ShipName", nullable = true, length = 40)
    private String shipName;
    @Basic
    @Column(name = "ShipAddress", nullable = true, length = 60)
    private String shipAddress;
    @Basic
    @Column(name = "ShipCity", nullable = true, length = 15)
    private String shipCity;
    @Basic
    @Column(name = "ShipRegion", nullable = true, length = 15)
    private String shipRegion;
    @Basic
    @Column(name = "ShipPostalCode", nullable = true, length = 10)
    private String shipPostalCode;
    @Basic
    @Column(name = "ShipCountry", nullable = true, length = 15)
    private String shipCountry;
}
