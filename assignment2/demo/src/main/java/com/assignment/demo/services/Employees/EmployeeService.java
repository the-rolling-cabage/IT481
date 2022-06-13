package com.assignment.demo.services.Employees;

import com.assignment.demo.controllers.dto.EmployeesDTO;
import com.assignment.demo.controllers.dto.LoginRequestDTO;
import com.assignment.demo.repositories.HugeSecurityIssueRepository;
import com.assignment.demo.repositories.TablesEnum;
import com.assignment.demo.repositories.models.EmployeesEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService implements Employees {

    private final HugeSecurityIssueRepository hugeSecurityIssueRepository = new HugeSecurityIssueRepository();
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public EmployeesDTO getData(LoginRequestDTO loginRequestDTO) throws JsonProcessingException {
        EmployeesDTO employeesDTO = new EmployeesDTO();
        List<Object> objects = hugeSecurityIssueRepository.makeQuery(loginRequestDTO, TablesEnum.EMPLOYEES);;
        List<EmployeesEntity> employeesEntities = new ArrayList<>();
        for (Object o : objects) {
            String jsonInString = mapper.writeValueAsString(o);
            EmployeesEntity[] entities = mapper.readValue(jsonInString, EmployeesEntity[].class);
            employeesEntities.addAll(Arrays.asList(entities));
        }
        employeesDTO.setEmployeesEntities(employeesEntities);
        employeesDTO.setRowCount(employeesEntities.size());
        return employeesDTO;
    }
}
