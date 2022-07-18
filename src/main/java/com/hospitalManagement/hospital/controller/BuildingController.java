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

import com.hospitalManagement.hospital.entity.Building;
import com.hospitalManagement.hospital.service.BuildingService;

@RestController
@RequestMapping("/")

public class BuildingController 
{
	
	@Autowired
	BuildingService BuildingService;
	
	@GetMapping("/Building")
	public List<Building> getAllBuilding()
	{
		return BuildingService.getBuilding();
	}
	
    @DeleteMapping("deleteBuilding/{id}")
    public void deleteBuildingById(@PathVariable("id") Long id){

    	BuildingService.deleteBuildingById(id);
    }

    @PostMapping("/newBuilding")
    public Building saveDepartment(@RequestBody Building Building){
        return BuildingService.addBuilding(Building);

    }
    
    @PutMapping("/updateBuilding")
    public Building updateDepartment(@RequestBody Building Building){
        return BuildingService.updateBuilding(Building);

    }
}
