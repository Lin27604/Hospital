package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepository extends JpaRepository<Ambulance,Long> {
}
