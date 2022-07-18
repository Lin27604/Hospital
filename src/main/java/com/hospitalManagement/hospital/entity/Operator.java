package com.hospitalManagement.hospital.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "operators")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Operator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operatorId;

	private String name;





}
