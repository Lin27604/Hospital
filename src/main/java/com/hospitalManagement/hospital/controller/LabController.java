package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.LabSample;

import com.hospitalManagement.hospital.serviceImpl.LabServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lab")
public class LabController {
    @Autowired
    LabServiceImpl labServiceImpl;

    //List All sample
    @GetMapping("/list/sample")
    public List<LabSample> listALlLabSample(){
        return labServiceImpl.listALlLabSample();
    }
    //Insert a new sample
    @PostMapping("/new/sample")
    public LabSample newLabSample(@RequestBody LabSample labSample){
        return labServiceImpl.newLabSample(labSample);
    }

    //Delete sample by id
    @DeleteMapping("/delete/sample/{id}")
    public void deleteSampleById(@PathVariable Long id){
        labServiceImpl.deleteSampleById(id);
    }
}
