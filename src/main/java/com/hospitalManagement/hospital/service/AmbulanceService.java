package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Ambulance;
import com.hospitalManagement.hospital.repository.AmbulanceRepository;
@Component
public class AmbulanceService {

	@Autowired
    AmbulanceRepository AmbulanceRepository;
	
	public List<Ambulance> getAmbulance()
	{
		return AmbulanceRepository.findAll();
	}
	

    public Ambulance addAmbulance(Ambulance Ambulance)
    {
        return AmbulanceRepository.save(Ambulance);
    }


    public void deleteAmbulanceById(Long id) {
    	AmbulanceRepository.deleteById(id);
    }
    
    public Ambulance updateAmbulance(Ambulance Ambulance)
    {
        return AmbulanceRepository.save(Ambulance);
    }
}
