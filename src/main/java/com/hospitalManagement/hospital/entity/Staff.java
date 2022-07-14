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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity

@Table(name = "staff")
@EntityListeners(AuditingEntityListener.class)
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
	@JoinColumn(name = "operator_id",
	             referencedColumnName = "operatorId"
	               )
	private Operator operator;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",
	             referencedColumnName = "departmentId"
	               )
	private Department department;

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
