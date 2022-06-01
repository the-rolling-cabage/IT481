package com.assignment.demo.repositories.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@Entity(name = "Customers")
@Table(name = "Customers", schema = "dbo", catalog = "Northwind")
public class Customers {
    @Id
    @Column(name = "CustomerID", nullable = false, length = 5)
    private String customerId;
    @Column(name = "CompanyName", nullable = false, length = 40)
    private String companyName;
    @Column(name = "ContactName", nullable = true, length = 30)
    private String contactName;
    @Column(name = "ContactTitle", nullable = true, length = 30)
    private String contactTitle;
    @Column(name = "Address", nullable = true, length = 60)
    private String address;
    @Column(name = "City", nullable = true, length = 15)
    private String city;
    @Column(name = "Region", nullable = true, length = 15)
    private String region;
    @Column(name = "PostalCode", nullable = true, length = 10)
    private String postalCode;
    @Column(name = "Country", nullable = true, length = 15)
    private String country;
    @Column(name = "Phone", nullable = true, length = 24)
    private String phone;
    @Column(name = "Fax", nullable = true, length = 24)
    private String fax;
}
