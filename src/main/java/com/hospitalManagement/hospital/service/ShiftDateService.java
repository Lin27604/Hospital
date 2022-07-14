package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.ShiftDate;
import com.hospitalManagement.hospital.repository.ShiftDateRepository;
@Component
public class ShiftDateService {

	@Autowired
    ShiftDateRepository ShiftDateRepository;
	
	public List<ShiftDate> getShiftDate()
	{
		return ShiftDateRepository.findAll();
	}
	

    public ShiftDate addShiftDate(ShiftDate ShiftDate)
    {
        return ShiftDateRepository.save(ShiftDate);
    }


    public void deleteShiftDateById(Long id) {
    	ShiftDateRepository.deleteById(id);
    }
    
    public ShiftDate updateShiftDate(ShiftDate ShiftDate)
    {
        return ShiftDateRepository.save(ShiftDate);
    }
}
