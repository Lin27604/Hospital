package com.hospitalManagement.hospital.service;


import com.hospitalManagement.hospital.entity.Appointment;
import com.hospitalManagement.hospital.entity.Patient;
import com.hospitalManagement.hospital.repository.AppointmentRepository;
import com.hospitalManagement.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private PatientRepository guestRepository;

    public Patient getGuestByGuestId(long guestId) {
        return guestRepository.findAll().get(0);
    }

}



