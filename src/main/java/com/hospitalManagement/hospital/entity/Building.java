package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "buildings")
@AllArgsConstructor
@NoArgsConstructor
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer buildingId;

	private String name;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(
//			name= "department_id",
//			referencedColumnName = "departmentId"
//	)
//    private List<Department> departmentLis;


}
