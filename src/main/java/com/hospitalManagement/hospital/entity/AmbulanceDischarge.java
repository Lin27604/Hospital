package com.hospitalManagement.hospital.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmbulanceDischarge {
	private Long id;
	private String startTime;
	private String finishTime;
	private Ambulance ambulance;
	private Emergency emergency;

}
