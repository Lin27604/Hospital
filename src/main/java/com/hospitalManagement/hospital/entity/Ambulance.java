package com.hospitalManagement.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@Table(name = "ambulance")
//@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
public class Ambulance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ambulanceId;
    @Column(columnDefinition = "int default 0")
	private Long status;
	public Long getAmbulanceId() {
		return ambulanceId;
	}
	public void setAmbulanceId(Long ambulanceId) {
		this.ambulanceId = ambulanceId;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
    
    
}
