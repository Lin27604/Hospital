package com.hospitalManagement.hospital.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "departments")
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;

	private String departName;



	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "building_id",
	             referencedColumnName = "buildingId"
	               )
	private Building building;

}
