package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    private final String TAG = "Department Service";
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department save(Department department) {
        log.info(TAG + ": save department");
        return departmentRepository.save(department);
    }

    public Department getDepartmentByDepartmentId(Long id) {
        log.info(TAG + ": get Department By Department Id");
        return departmentRepository.findByDepartmentId(id);
    }
}
