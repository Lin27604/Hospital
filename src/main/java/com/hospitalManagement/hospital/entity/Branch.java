package com.medical.hospitalBoot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "branch")
@EntityListeners(AuditingEntityListener.class)
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long branchId;
	
	private String name;

    private String phone;
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",
	             referencedColumnName = "addressId"
	               )
	private Address address;
	
	
}
