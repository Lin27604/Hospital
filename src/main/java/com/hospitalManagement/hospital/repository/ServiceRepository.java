package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Long>{

}
