package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.Ambulance;

import com.hospitalManagement.hospital.entity.AmbulanceDischarge;
import com.hospitalManagement.hospital.repository.AmbulanceDischargeRepository;
import com.hospitalManagement.hospital.repository.AmbulanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class AmbulanceServiceImpl {
    @Autowired
    AmbulanceRepository ambulanceRepository;
    @Autowired
    AmbulanceDischargeRepository dischargeRepository;


    public List<Ambulance> getAllAmbulance() {
       return ambulanceRepository.findAll();
    }

    public Optional<Ambulance> getAmbulanceById(Long id) {
        return ambulanceRepository.findById(id);
    }

    public void deleteAmbulanceById(long id) {
        ambulanceRepository.deleteById(id);
    }

    public Ambulance addAmbulanceById(Ambulance ambulance) {
        return ambulanceRepository.save(ambulance);
    }

    public Ambulance updateAmbulance(Ambulance ambulance, long id) {
        Ambulance ambulance1=ambulanceRepository.findById(id).get();
        if(Objects.nonNull(ambulance.getLocation())&&
                !"".equalsIgnoreCase(ambulance.getLocation())){
            ambulance1.setLocation(ambulance.getLocation());
        }
        if(Objects.nonNull(ambulance.getNumber())&&
                !"".equalsIgnoreCase(String.valueOf(ambulance.getNumber()))){
            ambulance1.setNumber(ambulance.getNumber());
        }
        if(Objects.nonNull(ambulance.getStatus())&&
                !"".equalsIgnoreCase(String.valueOf(ambulance.getStatus()))){
            ambulance1.setStatus(ambulance.getStatus());
        }
        return ambulanceRepository.save(ambulance1);
    }

    public List<AmbulanceDischarge> getAllAmbulanceDischarge() {
        return dischargeRepository.findAll();
    }

    public AmbulanceDischarge addAmbulanceDischarge(AmbulanceDischarge ambulanceDischarge) {
        return dischargeRepository.save(ambulanceDischarge);
    }

    public void deleteAmbulanceDischarge(Long id) {
        dischargeRepository.deleteById(id);
    }
}
