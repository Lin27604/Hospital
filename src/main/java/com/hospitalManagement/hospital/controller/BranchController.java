package com.hospitalManagement.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.hospital.entity.Branch;
import com.hospitalManagement.hospital.service.BranchService;

@RestController
@RequestMapping("/")

public class BranchController 
{
	
	@Autowired
	BranchService BranchService;
	
	@GetMapping("/Branch")
	public List<Branch> getAllBranch()
	{
		return BranchService.getBranch();
	}
	
    @DeleteMapping("deleteBranch/{id}")
    public void deleteBranchById(@PathVariable("id") Long id){

    	BranchService.deleteBranchById(id);
    }

    @PostMapping("/newBranch")
    public Branch saveDepartment(@RequestBody Branch Branch){
        return BranchService.addBranch(Branch);

    }
    
    @PutMapping("/updateBranch")
    public Branch updateDepartment(@RequestBody Branch Branch){
        return BranchService.updateBranch(Branch);

    }
}
