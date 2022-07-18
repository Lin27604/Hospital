package com.hospitalManagement.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.hospital.entity.Operator;
import com.hospitalManagement.hospital.service.OperatorService;

@RestController
@RequestMapping("/")
public class OperatorController {
	@Autowired
	OperatorService OperatorService;
	
	@GetMapping("/Operator")
	public List<Operator> getAllOperator()
	{
		return OperatorService.getOperator();
	}
	
    @DeleteMapping("deleteOperator/{id}")
    public void deleteOperatorById(@PathVariable("id") Long id){

    	OperatorService.deleteOperatorById(id);
    }

    @PostMapping("/newOperator")
    public Operator saveDepartment(@RequestBody Operator Operator){
        return OperatorService.addOperator(Operator);

    }
}
