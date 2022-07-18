package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "departments")
@EntityListeners(AuditingEntityListener.class)
public class Department {

	@Id
	private Long departmentId;

	private String departName;



	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "building_id",
	             referencedColumnName = "buildingId"
	               )
	private Building building;



	public Long getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}



	public String getDepartName() {
		return departName;
	}



	public void setDepartName(String departName) {
		this.departName = departName;
	}



	public Building getBuilding() {
		return building;
	}



	public void setBuilding(Building building) {
		this.building = building;
	}
	
	
	

}