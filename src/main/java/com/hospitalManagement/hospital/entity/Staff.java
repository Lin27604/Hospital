package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
	private Long id;
	private String name;
	private String dob;
	private String gender;
	private String position;
	private Address address;
	
	

}
