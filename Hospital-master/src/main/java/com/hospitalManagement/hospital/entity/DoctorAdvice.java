package main.java.com.hospitalManagement.hospital.entity;

import java.util.Date;

public class DoctorAdvice {
    private Long doctorId;
    private Long registeredId;
    private Long doctorAdviceId;
    private String risk;
    private String medicalBenefits;
    private Date date;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Long registeredId) {
        this.registeredId = registeredId;
    }

    public Long getDoctorAdviceId() {
        return doctorAdviceId;
    }

    public void setDoctorAdviceId(Long doctorAdviceId) {
        this.doctorAdviceId = doctorAdviceId;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getMedicalBenefits() {
        return medicalBenefits;
    }

    public void setMedicalBenefits(String medicalBenefits) {
        this.medicalBenefits = medicalBenefits;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
