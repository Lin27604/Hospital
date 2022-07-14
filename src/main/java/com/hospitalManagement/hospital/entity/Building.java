package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;


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
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
	private Set<Department> departments=new HashSet<>();



}
