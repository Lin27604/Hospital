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
@Table(name = "insurance")
@EntityListeners(AuditingEntityListener.class)
public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long insuranceId;
	
	private String name;
	
    @Column(length = 10, precision = 2, columnDefinition="DECIMAL(10,0)")
	private Double cover;

	public Long getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Long insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCover() {
		return cover;
	}

	public void setCover(Double cover) {
		this.cover = cover;
	}
    
    
}
