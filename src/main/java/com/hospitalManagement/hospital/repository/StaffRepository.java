package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long>{

}
