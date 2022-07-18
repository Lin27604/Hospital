package com.medical.hospitalBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.medical.hospitalBoot.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long>{

}
