package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Appointment;
import com.hospitalManagement.hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @DeleteMapping("/delete/{id}")
    public void cancelAppointment(@PathVariable("id") Long id) {
        appointmentService.deleteAppointmentById(id);
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Appointment postOrUpdateAppointment(@RequestBody Appointment appointment) {
        return appointmentService.insertOrUpdateAppointment(appointment);
    }
}
