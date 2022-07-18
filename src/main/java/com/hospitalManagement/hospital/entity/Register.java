package com.hospitalManagement.hospital.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
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

	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Long getRegisterId() {
		return registerId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getGender() {
		return gender;
	}

	public Address getAddress() {
		return address;
	}

	public Operator getOperator() {
		return operator;
	}

	private String password;

	private String email;

	private String firstName;

	private String lastName;

	private String birthday;

	private String gender;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",
	             referencedColumnName = "addressId"
	               )
	private Address address;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operator_id",
	             referencedColumnName = "operatorId"
	               )
	private Operator operator;
	 
	
}
