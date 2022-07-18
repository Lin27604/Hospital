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

import com.hospitalManagement.hospital.entity.Insurance;
import com.hospitalManagement.hospital.service.InsuranceService;

@RestController
@RequestMapping("/")

public class InsuranceController 
{
	
	@Autowired
	InsuranceService InsuranceService;
	
	@GetMapping("/Insurance")
	public List<Insurance> getAllInsurance()
	{
		return InsuranceService.getInsurance();
	}
	
    @DeleteMapping("deleteInsurance/{id}")
    public void deleteInsuranceById(@PathVariable("id") Long id){

    	InsuranceService.deleteInsuranceById(id);
    }

    @PostMapping("/newInsurance")
    public Insurance saveDepartment(@RequestBody Insurance Insurance){
        return InsuranceService.addInsurance(Insurance);

    }
    
    @PutMapping("/updateInsurance")
    public Insurance updateDepartment(@RequestBody Insurance Insurance){
        return InsuranceService.updateInsurance(Insurance);

    }
}
