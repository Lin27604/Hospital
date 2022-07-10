package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "departments")
@EntityListeners(AuditingEntityListener.class)
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;

	private String departName;



	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "building_id",
	             referencedColumnName = "buildingId"
	               )
	private Building building;
	
	

}