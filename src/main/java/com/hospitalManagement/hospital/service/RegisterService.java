package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.repository.RegisterRepository;

@Component
public class RegisterService 
{


	@Autowired
    RegisterRepository RegisterRepository;
	
	public List<Register> getRegister()
	{
		return RegisterRepository.findAll();
	}
	

    public Register addRegister(Register Register)
    {
        return RegisterRepository.save(Register);
    }


    public void deleteRegisterById(Long id) {
    	RegisterRepository.deleteById(id);
    }
    
    public Register updateRegister(Register Register)
    {
        return RegisterRepository.save(Register);
    }
}
