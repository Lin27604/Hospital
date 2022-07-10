package com.hospitalManagement.hospital.service;

import com.hospitalManagement.hospital.entity.Record;
import com.hospitalManagement.hospital.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    public List<Record> getRecordsByPatientId(Long patientId) {
        return repository.findByPatientId(patientId);
    }
}
