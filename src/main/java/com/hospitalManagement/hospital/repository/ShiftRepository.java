package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Long>{

}
