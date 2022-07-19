package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long> {
}
