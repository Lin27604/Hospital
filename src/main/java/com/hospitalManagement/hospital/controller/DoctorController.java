package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Appointment;
import com.hospitalManagement.hospital.entity.Record;
import com.hospitalManagement.hospital.service.AppointmentService;
import com.hospitalManagement.hospital.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private RecordService recordService;

    @GetMapping("/{id}/appointments")
    public List<Appointment> getAppointmentsByDoctorId(@PathVariable("id") Long id) {
        return appointmentService.getAppointmentByStaffId(id);
    }

    @GetMapping("/{id}/records")
    public List<Record> getRecordsByDoctorId(@PathVariable("id") Long id) {
        return recordService.getRecordsByStaffId(id);
    }
}
