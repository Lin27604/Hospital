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

import com.hospitalManagement.hospital.entity.ShiftDate;
import com.hospitalManagement.hospital.service.ShiftDateService;

@RestController
@RequestMapping("/")

public class ShiftDateController 
{
	
	@Autowired
	ShiftDateService ShiftDateService;
	
	@GetMapping("/ShiftDate")
	public List<ShiftDate> getAllShiftDate()
	{
		return ShiftDateService.getShiftDate();
	}
	
    @DeleteMapping("deleteShiftDate/{id}")
    public void deleteShiftDateById(@PathVariable("id") Long id){

    	ShiftDateService.deleteShiftDateById(id);
    }

    @PostMapping("/newShiftDate")
    public ShiftDate saveDepartment(@RequestBody ShiftDate ShiftDate){
        return ShiftDateService.addShiftDate(ShiftDate);

    }
    
    @PutMapping("/updateShiftDate")
    public ShiftDate updateDepartment(@RequestBody ShiftDate ShiftDate){
        return ShiftDateService.updateShiftDate(ShiftDate);

    }
}
