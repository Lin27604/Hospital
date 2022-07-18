package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Address;
import com.hospitalManagement.hospital.repository.AddressRepository;



@Component
public class AddressService {
	@Autowired
	
    AddressRepository addressRepository;
	
	public List<Address> getAddress()
	{
		return addressRepository.findAll();
	}
	

    public Address addAddress(Address address)
    {
        return addressRepository.save(address);
    }


    public void deleteAddressById(Long id) {
    	addressRepository.deleteById(id);
    }

    public Address updateAddress(Address address)
    {
        return addressRepository.save(address);
    }
}
