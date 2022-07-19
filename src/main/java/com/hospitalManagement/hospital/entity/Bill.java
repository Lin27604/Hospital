package com.hospitalManagement.hospital.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity

@Table(name = "bill")
@EntityListeners(AuditingEntityListener.class)
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id",
	             referencedColumnName = "patientId"
	               )
	private Patient patient;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "med_order_id",
	             referencedColumnName = "medOrderId"
	               )
	private MedOrder medorder;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "appointment_id",
	             referencedColumnName = "appointmentId"
	               )
	private Appointment appointment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insurance_id",
	             referencedColumnName = "insuranceId"
	               )
	private Insurance insurance;
	
	private double price;
	
	private Date date;
	
	private Time time;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public MedOrder getMedorder() {
		return medorder;
	}

	public void setMedorder(MedOrder medorder) {
		this.medorder = medorder;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
