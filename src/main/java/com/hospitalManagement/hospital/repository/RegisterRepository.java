package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long> {

    @Query(value = "SELECT * FROM Register r INNER JOIN operators o WHERE o.name='security'",nativeQuery = true)
    public List<Register> listAllSecurity();
}
