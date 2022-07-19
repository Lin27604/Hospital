package com.hospitalManagement.hospital.controller;

import java.util.List;

import com.hospitalManagement.hospital.entity.Bill;
import com.hospitalManagement.hospital.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/hosp")

public class BillController 
{
	
	@Autowired
    BillService BillService;
	
	@GetMapping("/Bill")
	public List<Bill> getAllBill()
	{
		return BillService.getBill();
	}
	
    @DeleteMapping("deleteBill/{id}")
    public void deleteBillById(@PathVariable("id") Long id){

    	BillService.deleteBillById(id);
    }

    @PostMapping("/newBill")
    public Bill saveDepartment(@RequestBody Bill Bill){
        return BillService.addBill(Bill);

    }
    
    @PutMapping("/updateBill")
    public Bill updateDepartment(@RequestBody Bill Bill){
        return BillService.updateBill(Bill);

    }
}
