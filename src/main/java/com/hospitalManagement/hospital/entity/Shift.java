package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shift {
	private String monday;
	private String tuesday;
	private String Wednesday;
	private String thursday;
	private String friday;
	private String saturaday;
	private String sunday;
	
	

}
