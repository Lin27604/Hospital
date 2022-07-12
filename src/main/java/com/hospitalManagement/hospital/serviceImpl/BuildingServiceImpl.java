package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.Building;
import com.hospitalManagement.hospital.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BuildingServiceImpl {

    @Autowired
    BuildingRepository buildingRepository;
    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();

    }

    public void deleteBuildingById(Long id) {
         buildingRepository.deleteById(id);
    }


}