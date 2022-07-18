package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long> {

    @Query(  "SELECT r FROM Register r JOIN r.operator o WHERE o.name='security'")
    public List<Register> listAllSecurity();
}
