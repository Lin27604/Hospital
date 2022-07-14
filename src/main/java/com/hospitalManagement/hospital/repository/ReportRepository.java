package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalManagement.hospital.entity.Report;

public interface ReportRepository extends JpaRepository<Report, Long>{

}
