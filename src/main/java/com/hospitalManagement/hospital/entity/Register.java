package com.medical.hospitalBoot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="registers")
@EntityListeners(AuditingEntityListener.class)
public class Register 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long registerId;
	
	private String username;
	
	private String password;

	private String email;

	private String firstName;

	private String lastName;

	private String birthday;

	private String gender;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",
	             referencedColumnName = "addressId"
	               )
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operator_id",
	             referencedColumnName = "operatorId"
	               )
	private Operator operator;
	 
	
}
