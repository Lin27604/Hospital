package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Shift;
import com.hospitalManagement.hospital.repository.ShiftRepository;
@Component
public class ShiftService {

	@Autowired
    ShiftRepository ShiftRepository;
	
	public List<Shift> getShift()
	{
		return ShiftRepository.findAll();
	}
	

    public Shift addShift(Shift Shift)
    {
        return ShiftRepository.save(Shift);
    }


    public void deleteShiftById(Long id) {
    	ShiftRepository.deleteById(id);
    }
    
    public Shift updateShift(Shift Shift)
    {
        return ShiftRepository.save(Shift);
    }
}
