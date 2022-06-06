package com.assignment.demo.services.Employees;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesRowMapper implements RowMapper<Thread.State> {
    @Override
    public Thread.State mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
