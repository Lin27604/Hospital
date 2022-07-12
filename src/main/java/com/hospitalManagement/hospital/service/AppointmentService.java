package com.hospitalManagement.hospital.service;

import com.hospitalManagement.hospital.entity.Appointment;
import com.hospitalManagement.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentsRepository;

    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
        return appointmentsRepository.findByPatientId(patientId);
    }

    public List<Appointment> getAppointmentByStaffId(Long staffId) {
        return appointmentsRepository.findByStaffId(staffId);
    }

    public void deleteAppointmentById(Long id) {
        appointmentsRepository.deleteById(id);
    }

    public Appointment insertOrUpdateAppointment(Appointment appointment) {
        return appointmentsRepository.save(appointment);
    }
}
