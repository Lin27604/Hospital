package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepositorty extends JpaRepository<Operator,Long> {
}
