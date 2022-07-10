package com.hospitalManagement.hospital.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="labSample")
@AllArgsConstructor
@NoArgsConstructor
public class LabSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sampleId;
	private String sampleName;
	private String type;
	private Date date;


}
