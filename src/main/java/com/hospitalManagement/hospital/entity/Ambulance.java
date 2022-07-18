package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name="ambulance")
@AllArgsConstructor
@NoArgsConstructor
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String location;
	private String status;





}
