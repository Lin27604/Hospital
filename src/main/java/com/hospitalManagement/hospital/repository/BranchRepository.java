package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long>{

}
