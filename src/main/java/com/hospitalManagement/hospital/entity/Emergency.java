//package com.hospitalManagement.hospital.entity;
//
//import java.util.Date;
//
//import javax.persistence.*;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Entity
//@Data
//@Table(name="Emergency")
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Emergency {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String condition;
//
//	@OneToMany(cascade = CascadeType.ALL )
//	@JoinColumn(name = "doctor_id",
//			referencedColumnName = "doctorId"
//	)
//	private Doctor doctor;
//    private Date date;
//
//
//}
