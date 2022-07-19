package com.hospitalManagement.hospital.service;

import java.util.List;

import com.hospitalManagement.hospital.entity.Bill;
import com.hospitalManagement.hospital.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillService {

	@Autowired
    BillRepository BillRepository;
	
	public List<Bill> getBill()
	{
		return BillRepository.findAll();
	}
	

    public Bill addBill(Bill Bill)
    {
        return BillRepository.save(Bill);
    }


    public void deleteBillById(Long id) {
    	BillRepository.deleteById(id);
    }   
    
    public Bill updateBill(Bill Bill)
    {
        return BillRepository.save(Bill);
    }
}
