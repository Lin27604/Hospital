package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Branch;
import com.hospitalManagement.hospital.repository.BranchRepository;
@Component
public class BranchService {

	@Autowired
    BranchRepository BranchRepository;
	
	public List<Branch> getBranch()
	{
		return BranchRepository.findAll();
	}
	

    public Branch addBranch(Branch Branch)
    {
        return BranchRepository.save(Branch);
    }


    public void deleteBranchById(Long id) {
    	BranchRepository.deleteById(id);
    }
    
    public Branch updateBranch(Branch Branch)
    {
        return BranchRepository.save(Branch);
    }
}
