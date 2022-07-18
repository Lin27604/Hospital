package com.medical.hospitalBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medical.hospitalBoot.entity.Bill;
import com.medical.hospitalBoot.repository.BillRepository;
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
