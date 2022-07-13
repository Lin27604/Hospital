package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MedRepository extends JpaRepository<Medicine, Long> {
}
