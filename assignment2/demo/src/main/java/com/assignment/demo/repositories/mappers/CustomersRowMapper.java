package com.assignment.demo.services.Customers;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersRowMapper implements RowMapper<Thread.State> {
    @Override
    public Thread.State mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
