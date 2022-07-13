package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift,Long> {
}
