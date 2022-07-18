package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Insurance;
import com.hospitalManagement.hospital.repository.InsuranceRepository;
@Component
public class InsuranceService {

	@Autowired
    InsuranceRepository InsuranceRepository;
	
	public List<Insurance> getInsurance()
	{
		return InsuranceRepository.findAll();
	}
	

    public Insurance addInsurance(Insurance Insurance)
    {
        return InsuranceRepository.save(Insurance);
    }


    public void deleteInsuranceById(Long id) {
    	InsuranceRepository.deleteById(id);
    }
    
    public Insurance updateInsurance(Insurance Insurance)
    {
        return InsuranceRepository.save(Insurance);
    }
}
