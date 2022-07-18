package com.hospitalManagement.hospital.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "nameAttributeInThisClassWithManyToOne")
public class AmbulanceDischarge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
//    @JoinColumn(name = "staff_id",
//            referencedColumnName = "staffId"
//    )
//	private Staff staff;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "ambulance_id",
            referencedColumnName = "id"
    )
	private Ambulance ambulance;
    private String location;
    private Date date;

}
