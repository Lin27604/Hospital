package com.hospitalManagement.hospital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "staff")
@EntityListeners(AuditingEntityListener.class)
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staffId;
	
    @Column(length = 10, precision = 2, columnDefinition="DECIMAL(10,0)")
	private Double salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "register_id",
	             referencedColumnName = "registerId"
	               )
	private Register register;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "position_id",
	             referencedColumnName = "positionId"
	               )
	private Position position;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",
	             referencedColumnName = "departmentId"
	               )
	private Department department;

}
