package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.MedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedOrderRepository extends JpaRepository<MedOrder,Long> {
}
