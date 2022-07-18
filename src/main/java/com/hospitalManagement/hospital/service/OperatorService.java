package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Operator;
import com.hospitalManagement.hospital.repository.OperatorRepository;
@Component
public class OperatorService {

	@Autowired
    OperatorRepository OperatorRepository;
	
	public List<Operator> getOperator()
	{
		return OperatorRepository.findAll();
	}
	

    public Operator addOperator(Operator Operator)
    {
        return OperatorRepository.save(Operator);
    }


    public void deleteOperatorById(Long id) {
    	OperatorRepository.deleteById(id);
    }
    
    public Operator updateOperator(Operator Operator)
    {
        return OperatorRepository.save(Operator);
    }
}
