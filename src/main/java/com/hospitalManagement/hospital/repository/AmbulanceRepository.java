package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AmbulanceRepository extends JpaRepository<Ambulance,Long> {
//    Optional<Ambulance> findById(Long id);
}
