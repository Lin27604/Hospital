package com.hospitalManagement.hospital.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="shift_date")
@EntityListeners(AuditingEntityListener.class)
public class ShiftDate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shiftDateId;
		
	private Date date;

	private Time startTime;
	
	private Time finishTime;

	public Long getShiftDateId() {
		return shiftDateId;
	}

	public void setShiftDateId(Long shiftDateId) {
		this.shiftDateId = shiftDateId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Time finishTime) {
		this.finishTime = finishTime;
	}
	
	
}
