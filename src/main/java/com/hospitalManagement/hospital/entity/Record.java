package com.hospitalManagement.hospital.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "records")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Record {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long recordId;

    private Long staffId;

    private Long patientId;

    private String description;

    private String medAdvice;

    private String type;

    private Date date;
}
