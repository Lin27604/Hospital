package com.medical.hospitalBoot.entity;

import javax.persistence.*;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "operators")
@EntityListeners(AuditingEntityListener.class)
public class Operator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operatorId;

	private String name;




}
