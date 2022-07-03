package com.hospitalManagement.hospital.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabSample {
	private Long id;
	private String sampleName;
	private String type;
	private Date date;
	

}
