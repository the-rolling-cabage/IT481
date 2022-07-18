package com.assignment.demo.repositories.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Employees", schema = "dbo", catalog = "Northwind")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmployeeID", nullable = false)
    private int employeeId;
    @Basic
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 10)
    private String firstName;
    @Basic
    @Column(name = "Title", nullable = true, length = 30)
    private String title;
    @Basic
    @Column(name = "TitleOfCourtesy", nullable = true, length = 25)
    private String titleOfCourtesy;
    @Basic
    @Column(name = "BirthDate", nullable = true)
    private Date birthDate;
    @Basic
    @Column(name = "HireDate", nullable = true)
    private Date hireDate;
    @Basic
    @Column(name = "Address", nullable = true, length = 60)
    private String address;
    @Basic
    @Column(name = "City", nullable = true, length = 15)
    private String city;
    @Basic
    @Column(name = "Region", nullable = true, length = 15)
    private String region;
    @Basic
    @Column(name = "PostalCode", nullable = true, length = 10)
    private String postalCode;
    @Basic
    @Column(name = "Country", nullable = true, length = 15)
    private String country;
    @Basic
    @Column(name = "HomePhone", nullable = true, length = 24)
    private String homePhone;
    @Basic
    @Column(name = "Salary", nullable = true)
    private Object salary;
    @Basic
    @Column(name = "Extension", nullable = true, length = 4)
    private String extension;
    @Basic
    @Column(name = "Photo", nullable = true)
    private byte[] photo;
    @Basic
    @Column(name = "Notes", nullable = true, length = -1)
    private String notes;
    @Basic
    @Column(name = "ReportsTo", nullable = true)
    private Integer reportsTo;
    @Basic
    @Column(name = "PhotoPath", nullable = true, length = 255)
    private String photoPath;

}
