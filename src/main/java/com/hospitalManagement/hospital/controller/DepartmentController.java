package com.hospitalManagement.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.hospital.entity.Department;
import com.hospitalManagement.hospital.service.DepartmentService;

@RestController
@RequestMapping("api/v1/hosp")

public class DepartmentController 
{
	
	@Autowired
	DepartmentService DepartmentService;
	
	@GetMapping("/Department")
	public List<Department> getAllDepartment()
	{
		return DepartmentService.getDepartment();
	}
	
    @DeleteMapping("deleteDepartment/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long id){

    	DepartmentService.deleteDepartmentById(id);
    }

    @PostMapping("/newDepartment")
    public Department saveDepartment(@RequestBody Department Department){
        return DepartmentService.addDepartment(Department);

    }
    
    @PutMapping("/updateDepartment")
    public Department updateDepartment(@RequestBody Department Department){
        return DepartmentService.updateDepartment(Department);

    }
}
