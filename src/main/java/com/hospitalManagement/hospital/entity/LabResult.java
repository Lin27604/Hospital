package com.hospitalManagement.hospital.entity;

import org.hibernate.dialect.function.StaticPrecisionFspTimestampFunction;

public class LabResult {
	private Long id;
	private String result;
	
	
	private LabSample labSample;
	private Staff technician;

}
