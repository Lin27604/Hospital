package com.medical.hospitalBoot.entity;

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
}
