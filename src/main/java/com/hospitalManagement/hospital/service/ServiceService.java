package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Service;
import com.hospitalManagement.hospital.repository.ServiceRepository;
@Component
public class ServiceService {

	@Autowired
    ServiceRepository ServiceRepository;
	
	public List<Service> getService()
	{
		return ServiceRepository.findAll();
	}
	

    public Service addService(Service Service)
    {
        return ServiceRepository.save(Service);
    }


    public void deleteServiceById(Long id) {
    	ServiceRepository.deleteById(id);
    }
    
    public Service updateService(Service Service)
    {
        return ServiceRepository.save(Service);
    }
}
