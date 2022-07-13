//package com.hospitalManagement.hospital.controller;
//
//import com.hospitalManagement.hospital.entity.Appointment;
//import com.hospitalManagement.hospital.entity.Record;
//import com.hospitalManagement.hospital.service.AppointmentService;
//import com.hospitalManagement.hospital.service.RecordService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/patient")
//public class PatientController {
//
//    @Autowired
//    private AppointmentService appointmentService;
//
//    @Autowired
//    private RecordService recordService;
//
//    @GetMapping("/{id}/appointments")
//    public List<Appointment> getAppointmentsByPatientId(@PathVariable("id") Long id) {
//        return appointmentService.getAppointmentsByPatientId(id);
//    }
//
//    @GetMapping("/{id}/records")
//    public List<Record> getRecordsByPatientId(@PathVariable("id") Long id) {
//        return recordService.getRecordsByPatientId(id);
//    }
//}
