package com.hospitalManagement.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospitalManagement.hospital.entity.Report;
import com.hospitalManagement.hospital.repository.ReportRepository;
@Component
public class ReportService {

	@Autowired
    ReportRepository ReportRepository;
	
	public List<Report> getReport()
	{
		return ReportRepository.findAll();
	}
	

    public Report addReport(Report Report)
    {
        return ReportRepository.save(Report);
    }


    public void deleteReportById(Long id) {
    	ReportRepository.deleteById(id);
    }
    
    public Report updateReport(Report Report)
    {
        return ReportRepository.save(Report);
    }
}
