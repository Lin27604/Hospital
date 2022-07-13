package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="shift")
@NoArgsConstructor
@AllArgsConstructor
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shiftId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id",
			referencedColumnName = "staffId"
	)
	private Staff staff;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shiftDate_id",
			referencedColumnName = "shiftDateId"
	)
	private ShiftDate shiftDate;



}
