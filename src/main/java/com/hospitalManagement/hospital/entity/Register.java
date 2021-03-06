package com.hospitalManagement.hospital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="register")
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",
	             referencedColumnName = "addressId"
	               )
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operator_id",
	             referencedColumnName = "operatorId"
	               )
	private Operator operator;

	public Long getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	 
	
	
}
