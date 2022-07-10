package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "buildings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buildingId;

	private String name;



}
