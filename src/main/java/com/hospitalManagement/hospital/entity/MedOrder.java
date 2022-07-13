package com.hospitalManagement.hospital.entity;


import javax.persistence.*;

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
	@Column(name="med_orderId")
	private Long id;
	private String quantity;
	private String total;
	private String deliveryStatu;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id",
			referencedColumnName = "patientId"
	)
	private Patient patient;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "med_id",
			referencedColumnName = "medicineId"
	)
	private Medicine medicine;


}
