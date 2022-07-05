package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import org.hibernate.boot.spi.AbstractDelegatingMetadataBuildingOptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	private Long id;
	private String name;
	private String function;
	private Building building;

}
