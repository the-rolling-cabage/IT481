package com.assignment.demo.repositories;

import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.repositories.mappers.CustomersRowMapper;
import com.assignment.demo.repositories.mappers.EmployeesRowMapper;
import com.assignment.demo.repositories.mappers.OrdersRowMapper;
import com.assignment.demo.repositories.models.CustomersEntity;
import com.assignment.demo.repositories.models.EmployeesEntity;
import com.assignment.demo.repositories.models.OrdersEntity;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HugeSecurityIssueRepository {
    private final String url = "jdbc:sqlserver://%s;database=%s;encrypt=true;trustServerCertificate=true;";
    private final EmployeesRowMapper employeeMapper = new EmployeesRowMapper();
    private final CustomersRowMapper customerMapper = new CustomersRowMapper();
    private final OrdersRowMapper ordersMapper = new OrdersRowMapper();


    public List<Object> makeQuery(LoginRequestDTO loginRequestDTO, TablesEnum tableName) {
        String connUrl = String.format(url, loginRequestDTO.getUrl(), loginRequestDTO.getDatabase());
        Connection con = null;
        try {
            DriverManager.registerDriver(new SQLServerDriver());
            con = DriverManager.getConnection(connUrl, loginRequestDTO.getUsername(), loginRequestDTO.getPassword());
            Statement st = con.createStatement();
            String sql = String.format("select * from dbo.%s", TablesEnum(tableName));
            switch (tableName) {
                case EMPLOYEES -> {
                    ResultSet rs = st.executeQuery(sql);
                    List<EmployeesEntity> employeesEntities = new ArrayList<>();
                    while (rs.next()) {
                        employeesEntities.add(employeeMapper.mapRow(rs));
                    }
                    return List.of(employeesEntities);
                }
                case ORDERS -> {
                    ResultSet rs = st.executeQuery(sql);
                    List<OrdersEntity> ordersEntities = new ArrayList<>();
                    while (rs.next()) {
                        ordersEntities.add(ordersMapper.mapRow(rs));
                    }
                    return List.of(ordersEntities);
                }
                case CUSTOMERS -> {
                    ResultSet rs = st.executeQuery(sql);
                    List<CustomersEntity> customersEntities = new ArrayList<>();
                    while (rs.next()) {
                        customersEntities.add(customerMapper.mapRow(rs));
                    }
                    return List.of(customersEntities);
                }
            }
        } catch (Exception e) {
            if (e.getMessage().contains("denied")) {
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, e.toString());
            }
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.toString(), e);
        }
        return Collections.EMPTY_LIST;
    }

    private String TablesEnum(TablesEnum tablesEnum) {
        return switch (tablesEnum) {
            case EMPLOYEES -> "Employees";
            case ORDERS -> "Orders";
            case CUSTOMERS -> "Customers";
        };
    }
}
