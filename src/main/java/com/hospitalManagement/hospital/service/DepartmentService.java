package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Department;
import com.hospitalManagement.hospital.repository.DepartmentRepository;
@Component
public class DepartmentService {

	@Autowired
    DepartmentRepository DepartmentRepository;
	
	public List<Department> getDepartment()
	{
		return DepartmentRepository.findAll();
	}
	

    public Department addDepartment(Department Department)
    {
        return DepartmentRepository.save(Department);
    }


    public void deleteDepartmentById(Long id) {
    	DepartmentRepository.deleteById(id);
    }
    
    public Department updateDepartment(Department Department)
    {
        return DepartmentRepository.save(Department);
    }
}
