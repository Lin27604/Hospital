package com.hospitalManagement.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalManagement.hospital.entity.Report;
import com.hospitalManagement.hospital.service.ReportService;

@RestController
@RequestMapping("/")

public class ReportController 
{
	
	@Autowired
	ReportService ReportService;
	
	@GetMapping("/Report")
	public List<Report> getAllReport()
	{
		return ReportService.getReport();
	}
	
    @DeleteMapping("deleteReport/{id}")
    public void deleteReportById(@PathVariable("id") Long id){

    	ReportService.deleteReportById(id);
    }

    @PostMapping("/newReport")
    public Report saveDepartment(@RequestBody Report Report){
        return ReportService.addReport(Report);

    }
    
    @PutMapping("/updateReport")
    public Report updateDepartment(@RequestBody Report Report){
        return ReportService.updateReport(Report);

    }
}