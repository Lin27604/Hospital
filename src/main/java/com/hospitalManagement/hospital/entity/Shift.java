package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name="shifts")
@NoArgsConstructor
@AllArgsConstructor
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shiftId;

	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinTable(name="staff_shift",
	           joinColumns = {@JoinColumn(name = "shift_id", referencedColumnName = "shiftId")},
			  inverseJoinColumns = {@JoinColumn(name = "staff_id", referencedColumnName = "staffId")}
			   )
	private Set<Staff> staffs = new HashSet<>();

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shiftDate_id",
			referencedColumnName = "shiftDateId"
	)
	private ShiftDate shiftDate;



}
