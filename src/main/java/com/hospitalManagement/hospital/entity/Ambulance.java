package com.hospitalManagement.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "ambulance")
@EntityListeners(AuditingEntityListener.class)
public class Ambulance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ambulanceId;
    @Column(columnDefinition = "int default 0")
	private Long status;
}
