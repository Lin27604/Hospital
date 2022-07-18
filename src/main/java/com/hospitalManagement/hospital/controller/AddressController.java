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

import com.hospitalManagement.hospital.entity.Address;
import com.hospitalManagement.hospital.service.AddressService;


@RestController
@RequestMapping("api/v1/hosp")

public class AddressController 
{
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/address")
	public List<Address> getAllAddress()
	{
		return addressService.getAddress();
	}
	
    @DeleteMapping("deleteAddress/{id}")
    public void deleteAddressById(@PathVariable("id") Long id){

    	addressService.deleteAddressById(id);
    }

    @PostMapping("/newAddress")
    public Address saveDepartment(@RequestBody Address address){
        return addressService.addAddress(address);

    }
    
    @PutMapping("/updateAddress")
    public Address updateDepartment(@RequestBody Address address){
        return addressService.updateAddress(address);

    }
}
