package com.hospitalManagement.hospital.entity;

import javax.persistence.*;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "operators")
@EntityListeners(AuditingEntityListener.class)
public class Operator {
	@Id
	private Long operatorId;

	private String name;

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
