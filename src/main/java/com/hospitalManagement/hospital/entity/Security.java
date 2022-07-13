package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "security")
@AllArgsConstructor
@NoArgsConstructor
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    @ManyToOne(targetEntity = Staff.class,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id",
            referencedColumnName = "staffId"
    )
	private Staff staff;
	private String report;

	private Date date;




}
