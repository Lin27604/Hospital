package com.hospitalManagement.hospital.entity;

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
@Table(name="shift")
@EntityListeners(AuditingEntityListener.class)
public class Shift {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shiftId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id",
	             referencedColumnName = "staffId"
	               )
	private Staff staff;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shiftDate_id",
	             referencedColumnName = "shiftDateId"
	               )
	private ShiftDate shiftDate;

	public Long getShiftId() {
		return shiftId;
	}

	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public ShiftDate getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(ShiftDate shiftDate) {
		this.shiftDate = shiftDate;
	}
	
	
}
