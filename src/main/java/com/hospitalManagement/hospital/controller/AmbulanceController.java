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

import com.hospitalManagement.hospital.entity.Ambulance;
import com.hospitalManagement.hospital.service.AmbulanceService;

@RestController
@RequestMapping("/")

public class AmbulanceController 
{
	
	@Autowired
	AmbulanceService AmbulanceService;
	
	@GetMapping("/Ambulance")
	public List<Ambulance> getAllAmbulance()
	{
		return AmbulanceService.getAmbulance();
	}
	
    @DeleteMapping("deleteAmbulance/{id}")
    public void deleteAmbulanceById(@PathVariable("id") Long id){

    	AmbulanceService.deleteAmbulanceById(id);
    }

    @PostMapping("/newAmbulance")
    public Ambulance saveDepartment(@RequestBody Ambulance Ambulance){
        return AmbulanceService.addAmbulance(Ambulance);

    }
    
    @PutMapping("/updateAmbulance")
    public Ambulance updateDepartment(@RequestBody Ambulance Ambulance){
        return AmbulanceService.updateAmbulance(Ambulance);

    }
}