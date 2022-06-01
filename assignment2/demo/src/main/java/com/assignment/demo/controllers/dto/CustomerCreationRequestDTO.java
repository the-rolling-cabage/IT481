package com.assignment.demo.controllers.dto;

import lombok.Data;

@Data
public class CustomerCreationRequestDTO {
    private String companyName;
   private String contactName;
    private String contactTitle;
}
