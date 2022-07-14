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

import com.hospitalManagement.hospital.entity.Shift;
import com.hospitalManagement.hospital.service.ShiftService;

@RestController
@RequestMapping("/")

public class ShiftController 
{
	
	@Autowired
	ShiftService ShiftService;
	
	@GetMapping("/Shift")
	public List<Shift> getAllShift()
	{
		return ShiftService.getShift();
	}
	
    @DeleteMapping("deleteShift/{id}")
    public void deleteShiftById(@PathVariable("id") Long id){

    	ShiftService.deleteShiftById(id);
    }

    @PostMapping("/newShift")
    public Shift saveDepartment(@RequestBody Shift Shift){
        return ShiftService.addShift(Shift);

    }
    
    @PutMapping("/updateShift")
    public Shift updateDepartment(@RequestBody Shift Shift){
        return ShiftService.updateShift(Shift);

    }
}
