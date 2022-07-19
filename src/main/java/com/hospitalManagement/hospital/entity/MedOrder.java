package com.hospitalManagement.hospital.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="MedOrder")
@AllArgsConstructor
@NoArgsConstructor
public class MedOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medOrderId;

	private String quantity;
	private String total;
	private String deliveryStatu;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id",
			referencedColumnName = "patientId"
	)
	private Patient patient;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name = "med_id",
			referencedColumnName = "medicineId"
	)
	private Medicine medicine;


}
