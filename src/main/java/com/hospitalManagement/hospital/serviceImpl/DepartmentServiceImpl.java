package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.Department;
import com.hospitalManagement.hospital.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentServiceImpl {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }
}
