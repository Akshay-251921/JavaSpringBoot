package com.example.EmployeeManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check {
    @GetMapping("/get")
    public String checker(){
        return "Rana Pundir";
    }
}
