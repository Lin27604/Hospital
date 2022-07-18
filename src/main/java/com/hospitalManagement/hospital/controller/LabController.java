package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.LabResult;
import com.hospitalManagement.hospital.entity.LabSample;

import com.hospitalManagement.hospital.serviceImpl.LabServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LabController {
    @Autowired
    LabServiceImpl labServiceImpl;

    //List All sample
    @GetMapping("/sample")
    public List<LabSample> listALlLabSample(){
        return labServiceImpl.listALlLabSample();
    }
    //Insert a new sample
    @PostMapping("/sample")
    public LabSample newLabSample(@RequestBody LabSample labSample){
        return labServiceImpl.newLabSample(labSample);
    }

    //Delete sample by id
    @DeleteMapping("/sample/{id}")
    public void deleteSampleById(@PathVariable("id") Long id){
        labServiceImpl.deleteSampleById(id);
    }
    /** Sample Result Implementation
     ***************************************
     *************************************
     * */
    //List all sample result
    @GetMapping("/sample/result")
    public List<LabResult> listAllSampleResult(){
        return labServiceImpl.listAllSampleResult();
    }
    //Insert new sample result
    @PostMapping("/new/sample/result")
    public LabResult newSampleResult(@RequestBody LabResult labResult){
        return labServiceImpl.newSampleResult(labResult);
    }

    @DeleteMapping("/delete/result/{id}")
    public void deleteSampleResultById(@PathVariable("id") long id){
        labServiceImpl.deleteSampleResultById(id);

    }

}
