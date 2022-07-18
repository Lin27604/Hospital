package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Ambulance;
import com.hospitalManagement.hospital.entity.AmbulanceDischarge;
import com.hospitalManagement.hospital.serviceImpl.AmbulanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class AmbulanceController {
    @Autowired
    AmbulanceServiceImpl ambulanceService;
    @GetMapping("/ambulance")
    public List<Ambulance> getAllAmbulance(){
        return ambulanceService.getAllAmbulance();
    }
    @GetMapping("/ambulance/{id}")
    public Optional<Ambulance> getAmbulanceById(@PathVariable("id") long id){

        return ambulanceService.getAmbulanceById(id);
    }
    @DeleteMapping("/ambulance/{id}")
    public void deleteAmbulanceById(@PathVariable("id") long id){

          ambulanceService.deleteAmbulanceById(id);
    }
    @PostMapping ("/ambulance")
    public Ambulance addAmbulance(@RequestBody Ambulance ambulance){

        return ambulanceService.addAmbulanceById(ambulance);
    }
    @PutMapping ("/ambulance/{id}")
    public Ambulance updateAmbulance(@RequestBody Ambulance ambulance, @PathVariable("id") long id){

        return ambulanceService.updateAmbulance(ambulance,id);
    }

    /** Ambulance Discharge
     * --------------------*/
    @GetMapping("/ambulance/discharge")
    public List<AmbulanceDischarge> getAllAmbulanceDischarge(){
        return ambulanceService.getAllAmbulanceDischarge();
    }
    @PostMapping("/ambulance/discharge")
    public AmbulanceDischarge addAmbulanceDischarge(@RequestBody AmbulanceDischarge ambulanceDischarge){
        return ambulanceService.addAmbulanceDischarge(ambulanceDischarge);
    }
    @DeleteMapping("/ambulance/discharge/{id}")
    public void deleteAmbulanceDischarge(@PathVariable("id") Long id){
        ambulanceService.deleteAmbulanceDischarge(id);
    }

}
