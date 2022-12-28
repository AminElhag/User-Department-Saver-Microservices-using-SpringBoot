package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    private final String TAG = "Department Controller";
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info(TAG + ": save department");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentByDepartmentId(@PathVariable("id") Long id){
        log.info(TAG + ": get Department By Department Id");
        return departmentService.getDepartmentByDepartmentId(id);
    }
}
