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

import com.hospitalManagement.hospital.entity.Service;
import com.hospitalManagement.hospital.service.ServiceService;

@RestController
@RequestMapping("/")

public class ServiceController 
{
	
	@Autowired
	ServiceService ServiceService;
	
	@GetMapping("/Service")
	public List<Service> getAllService()
	{
		return ServiceService.getService();
	}
	
    @DeleteMapping("deleteService/{id}")
    public void deleteServiceById(@PathVariable("id") Long id){

    	ServiceService.deleteServiceById(id);
    }

    @PostMapping("/newService")
    public Service saveDepartment(@RequestBody Service Service){
        return ServiceService.addService(Service);

    }
    
    @PutMapping("/updateService")
    public Service updateDepartment(@RequestBody Service Service){
        return ServiceService.updateService(Service);

    }
}
