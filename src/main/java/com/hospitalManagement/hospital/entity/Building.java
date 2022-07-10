package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "buildings")
@EntityListeners(AuditingEntityListener.class)
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buildingId;

	private String name;


}