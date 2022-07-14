package com.hospitalManagement.hospital.repository;


import com.hospitalManagement.hospital.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security,Long> {
//
//    @Query("SELECT s FROM Shift s JOIN s.staff st JOIN st.register r JOIN r.operator WHERE operator ='security'")
//    public List<Security> listALLSecurityReport();



}
