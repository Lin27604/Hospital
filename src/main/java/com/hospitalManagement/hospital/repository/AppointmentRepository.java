package com.hospitalManagement.hospital.repository;

import com.hospitalManagement.hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByPatientId(Long patientId);

    List<Appointment> findByStaffId(Long staffId);

    List<Appointment> findByNurseId(Long nurseId);

    List<Appointment> findByGuestId(Long guestId);
}
