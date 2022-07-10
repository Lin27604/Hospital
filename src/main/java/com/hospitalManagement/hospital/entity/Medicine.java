package com.hospitalManagement.hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="medicine")
@EntityListeners(AuditingEntityListener.class)

public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medicineId;
	
	private String name;
	
	private String category;
    @Column(length = 10, precision = 2, columnDefinition="DECIMAL(10,2)")
	private Double price;

	private Long quantity;

	private Date produceDate;

	private Date validDate;

	
}
