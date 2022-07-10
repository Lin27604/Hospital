package com.hospitalManagement.hospital.service;

import com.hospitalManagement.hospital.entity.Patient;
import com.hospitalManagement.hospital.entity.Record;
import com.hospitalManagement.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient getPatientByPatientId(long patientId) {
        return patientRepository.findAll().get(0);
    }

}
