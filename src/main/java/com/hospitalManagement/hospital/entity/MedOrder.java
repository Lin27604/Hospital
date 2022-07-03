package com.hospitalManagement.hospital.entity;

import javax.imageio.spi.RegisterableService;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedOrder {
	private Long id;
	private String quantity;
	private String total;
	private String deliveryStatu;
	private Register patient;
	private Medicine medicine;
	

}
