package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {
	
	private long id;
	private String category;
	private String name;
	private String price;
	private String quantity;
	
	

}
