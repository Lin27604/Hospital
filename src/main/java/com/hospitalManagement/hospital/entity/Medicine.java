package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name="medicine")
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medicineId;

	private String name;

	private String category;
	@Column(length = 10, precision = 2, columnDefinition="DECIMAL(10,2)")
	private Double price;

	private Long quantity;

	private Date produceDate;

	private Date validDate;





}
