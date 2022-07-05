package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branches {

	private Long id;
	private String name;
	private String address;
	private String phone;
}
