package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmbulanceDischarge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id",
            referencedColumnName = "staffId"
    )
	private Staff staff;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ambulance_id",
            referencedColumnName = "id"
    )
	private Ambulance ambulance;
    private String location;
    private Date date;

}
