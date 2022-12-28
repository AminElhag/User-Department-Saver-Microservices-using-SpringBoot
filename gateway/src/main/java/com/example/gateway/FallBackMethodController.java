package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack() {
        return "User Service have bad time. Please try later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return "Department Service have bad time. Please try later";
    }
}
