package com.assignment.demo.controllers.dto;

import lombok.Data;

@Data
public class LoginRequestDTO {
    private String username;
    private String password;
    private String url;
    private String database;
}
