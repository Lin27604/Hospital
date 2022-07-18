package com.hospitalManagement.hospital.repository;


import com.hospitalManagement.hospital.entity.Security;
import com.hospitalManagement.hospital.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security,Long> {


}
