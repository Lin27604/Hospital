package main.java.com.hospitalManagement.hospital.entity;

import java.util.Date;

public class Appointment {
    private Long AppointmentId;
    private Long patientId;
    private String department;
    private String reason;
    private Long doctorId;
    private Date date;
    private Date time;

    public Long getAppointmentId() {
        return AppointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        AppointmentId = appointmentId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
