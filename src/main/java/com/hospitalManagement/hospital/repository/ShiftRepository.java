package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShiftRepository extends JpaRepository<Shift,Long> {
//    @Query(value = "SELECT * FROM Shifts s INNER JOIN staff_shift ss on s.shift_id =ss.shift_id INNER JOIN staffs st on ss.staff_id = st.staff_id" +
//            " INNER JOIN operators o WHERE o.name ='security'",nativeQuery = true)
//    public List<Shift> listALLSecurityShift();
}
