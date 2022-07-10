package com.hospitalManagement.hospital.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DoctorAdvice {
    private Long doctorId;
    private Long registeredId;
    private Long doctorAdviceId;
    private String risk;
    private String medicalBenefits;
    private Date date;
}
