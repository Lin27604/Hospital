package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse,Long> {
}
