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

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.service.RegisterService;


@RestController
@RequestMapping("/")
public class RegisterController 
{

	@Autowired
	RegisterService RegisterService;
	
	@GetMapping("/Register")
	public List<Register> getAllRegister()
	{
		return RegisterService.getRegister();
	}
	
    @DeleteMapping("deleteRegister/{id}")
    public void deleteRegisterById(@PathVariable("id") Long id){

    	RegisterService.deleteRegisterById(id);
    }

    @PostMapping("/newRegister")
    public Register saveDepartment(@RequestBody Register Register){
        return RegisterService.addRegister(Register);

    }
    
}
