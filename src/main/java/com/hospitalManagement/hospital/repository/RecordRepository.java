package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

    List<Record> findByPatientId(Long patientId);

    List<Record> findByStaffId(Long staffId);

    List<Record> findByNurseId(Long nurseId);

    List<Record> findByGuestId(Long guestId);
}
