package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
