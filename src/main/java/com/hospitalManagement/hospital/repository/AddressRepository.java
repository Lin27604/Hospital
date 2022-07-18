package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hospitalManagement.hospital.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
