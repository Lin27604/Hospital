package com.hospitalManagement.hospital.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name="labResult")
@AllArgsConstructor
@NoArgsConstructor
public class LabResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String result;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sample_id",
			referencedColumnName = "sampleId")
	private LabSample labSample;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "technician_id",
			referencedColumnName = "staffId")
	private Staff technician;
	private Date testDate;

}
