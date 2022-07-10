package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "position")
@EntityListeners(AuditingEntityListener.class)

public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long positionId;

	private String name;
}
