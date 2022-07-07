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

public class Emergency {
	private Long id;
	private String condition;
	private String location;
	private Date date;

}
