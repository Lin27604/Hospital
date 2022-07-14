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

import com.hospitalManagement.hospital.entity.Staff;
import com.hospitalManagement.hospital.service.StaffService;

@RestController
@RequestMapping("/")

public class StaffController 
{
	
	@Autowired
	StaffService StaffService;
	
	@GetMapping("/Staff")
	public List<Staff> getAllStaff()
	{
		return StaffService.getStaff();
	}
	
    @DeleteMapping("deleteStaff/{id}")
    public void deleteStaffById(@PathVariable("id") Long id){

    	StaffService.deleteStaffById(id);
    }

    @PostMapping("/newStaff")
    public Staff saveDepartment(@RequestBody Staff Staff){
        return StaffService.addStaff(Staff);

    }
    
    @PutMapping("/updateStaff")
    public Staff updateDepartment(@RequestBody Staff Staff){
        return StaffService.updateStaff(Staff);

    }
}
