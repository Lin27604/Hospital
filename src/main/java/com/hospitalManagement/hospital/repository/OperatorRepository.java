package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator, Long>{

}
