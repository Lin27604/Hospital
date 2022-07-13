package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.LabSample;
import com.hospitalManagement.hospital.repository.LabResultRepository;
import com.hospitalManagement.hospital.repository.LabSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class LabServiceImpl {

     @Autowired
    LabSampleRepository labSampleRepository;
     @Autowired
    LabResultRepository labResultRepository;

     //list all sample
    public List<LabSample> listALlLabSample() {
        return labSampleRepository.findAll();
    }
    //add new sample
    public LabSample newLabSample(LabSample labSample) {
        return labSampleRepository.save(labSample);
    }
    //delete sample by Id
    public void deleteSampleById(Long id) {
        labSampleRepository.deleteById(id);
    }
}
