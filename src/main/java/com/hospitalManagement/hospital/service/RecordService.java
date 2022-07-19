package com.hospitalManagement.hospital.service;

import com.hospitalManagement.hospital.entity.Appointment;
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

    public List<Record> getRecordsByStaffId(Long staffId) {
        return repository.findByStaffId(staffId);
    }

    public List<Record> getRecordsByNurseId(Long nurseId) { return repository.findByNurseId(nurseId);}

    public List<Record> getRecordsByGuestId(Long guestId) {
        return repository.findByGuestId(guestId);
    }

    public Record insertOrUpdateRecord(Record record) {
        return repository.save(record);
    }

}
