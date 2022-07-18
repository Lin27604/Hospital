package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "staffs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(exclude = "nameAttributeInThisClassWithOneToMany")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long staffId;
	
    @Column(length = 10, precision = 2, columnDefinition="DECIMAL(10,0)")
	private Double salary;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "register_id",
	             referencedColumnName = "registerId"
	               )
	private Register register;



	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",
	             referencedColumnName = "departmentId"
	               )
	private Department department;

	@ManyToMany(mappedBy = "staffs",fetch = FetchType.LAZY)
	private Set<Shift> shifts= new HashSet<>();





}
