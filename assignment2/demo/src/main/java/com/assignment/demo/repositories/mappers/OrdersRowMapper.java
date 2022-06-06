package com.assignment.demo.repositories.mappers;

import com.assignment.demo.repositories.models.EmployeesEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesRowMapper {
    public EmployeesEntity mapRow(ResultSet rs) throws SQLException {
        return null;
    }
}
