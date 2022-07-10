package com.medical.hospitalBoot.entity;

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
@Table(name="report")
@EntityListeners(AuditingEntityListener.class)
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reportId;
	
	private String description;
	
	private Date date;

	private Time time;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "building_id",
	             referencedColumnName = "buildingId"
	               )
	private Building building;

}
