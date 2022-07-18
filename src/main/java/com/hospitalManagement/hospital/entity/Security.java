package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "security")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "nameAttributeInThisClassWithOneToMany")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

	private String report;

	private Date date;




}
