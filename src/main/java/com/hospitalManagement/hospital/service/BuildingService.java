package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Building;
import com.hospitalManagement.hospital.repository.BuildingRepository;
@Component
public class BuildingService {

	@Autowired
    BuildingRepository BuildingRepository;
	
	public List<Building> getBuilding()
	{
		return BuildingRepository.findAll();
	}
	

    public Building addBuilding(Building Building)
    {
        return BuildingRepository.save(Building);
    }


    public void deleteBuildingById(Long id) {
    	BuildingRepository.deleteById(id);
    }
    
    public Building updateBuilding(Building Building)
    {
        return BuildingRepository.save(Building);
    }
}
