package com.hospitalManagement.hospital.entity;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="labSample")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class LabSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sampleId;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id",
			referencedColumnName = "patientId")
    private Patient patient;
	private String sampleName;
	private String type;
	private Date date;


}
