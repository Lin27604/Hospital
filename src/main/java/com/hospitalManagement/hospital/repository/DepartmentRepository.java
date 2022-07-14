package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
