package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BillRepository extends JpaRepository<Bill, Long>{

}
