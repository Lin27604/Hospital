package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="medicine")
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String category;
	private String name;
	private Double price;
	private Long quantity;



}
