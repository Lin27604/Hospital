package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Staff;
import com.hospitalManagement.hospital.repository.StaffRepository;
@Component
public class StaffService {

	@Autowired
    StaffRepository StaffRepository;
	
	public List<Staff> getStaff()
	{
		return StaffRepository.findAll();
	}
	

    public Staff addStaff(Staff Staff)
    {
        return StaffRepository.save(Staff);
    }


    public void deleteStaffById(Long id) {
    	StaffRepository.deleteById(id);
    }   
    
    public Staff updateStaff(Staff Staff)
    {
        return StaffRepository.save(Staff);
    }
}
