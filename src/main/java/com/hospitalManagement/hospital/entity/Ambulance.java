package com.hospitalManagement.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@Table(name = "ambulance")
@NoArgsConstructor
@AllArgsConstructor
public class Ambulance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ambulanceId;
	private String number;
	private String location;
	private String status;
    
    
}
