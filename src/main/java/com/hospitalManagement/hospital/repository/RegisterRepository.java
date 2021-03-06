package com.hospitalManagement.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalManagement.hospital.entity.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long>
{

}
