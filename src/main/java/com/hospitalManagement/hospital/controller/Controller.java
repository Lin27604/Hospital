package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Building;
import com.hospitalManagement.hospital.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    BuildingService buildingService;
    @GetMapping("/building")
    public List<Building> getAllBuildings(){

        return buildingService.getAllBuildings();
    }
    @DeleteMapping("deleteBuilding/{id}")
    public void deleteBuildingById(@PathVariable("id") Long id){
         buildingService.deleteBuildingById(id);
    }

}
