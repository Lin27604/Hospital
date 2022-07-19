package com.hospitalManagement.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "guest")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id",
            referencedColumnName = "doctorId"
    )
    private Doctor doctor;



}
