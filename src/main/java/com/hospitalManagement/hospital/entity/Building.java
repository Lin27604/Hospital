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

    @Column(columnDefinition = "int default 0")
	private Long status;

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
    
    
}