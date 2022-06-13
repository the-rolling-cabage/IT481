package com.assignment.demo.repositories.mappers;

import com.assignment.demo.repositories.models.EmployeesEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesRowMapper {
    public EmployeesEntity mapRow(ResultSet rs) throws SQLException {
        return EmployeesEntity.builder()
                .employeeId(rs.getInt("EmployeeID"))
                .lastName(rs.getString("LastName"))
                .firstName(rs.getString("FirstName"))
                .title(rs.getString("Title"))
                .titleOfCourtesy(rs.getString("TitleOfCourtesy")).build();
    }
}
