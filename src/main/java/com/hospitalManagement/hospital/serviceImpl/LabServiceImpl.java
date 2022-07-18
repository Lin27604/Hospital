package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.LabResult;
import com.hospitalManagement.hospital.entity.LabSample;
import com.hospitalManagement.hospital.repository.LabResultRepository;
import com.hospitalManagement.hospital.repository.LabSampleRepository;
import net.bytebuddy.implementation.Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Objects;

@Component
public class LabServiceImpl {

     @Autowired
    LabSampleRepository labSampleRepository;
     @Autowired
    LabResultRepository labResultRepository;

    /** Sample Implementation
     ***************************************
     *************************************
     * */
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
    public LabSample updateSampleById(LabSample labSample, Long id) {
        LabSample sample=labSampleRepository.findById(id).get();
        if(Objects.nonNull( labSample.getSampleName())&&
                !"".equalsIgnoreCase( labSample.getSampleName())){
             sample.setSampleName( labSample.getSampleName());
        }
        if(Objects.nonNull( labSample.getDate())&&
                !"".equalsIgnoreCase(String.valueOf(labSample.getDate()))){
             sample.setDate( labSample.getDate());
        }
        if(Objects.nonNull( labSample.getType())&&
                !"".equalsIgnoreCase( labSample.getType())){
             sample.setType( labSample.getType());
        }
        if(Objects.nonNull( labSample.getPatient())&&
                !"".equalsIgnoreCase(String.valueOf(labSample.getPatient()))){
             sample.setPatient( labSample.getPatient());
        }
        return labSampleRepository.save(sample);
    }
    
    /** Sample Result Implementation
     ***************************************
    *************************************
    * */
    //List all sample result
    public List<LabResult> listAllSampleResult() {
        return labResultRepository.findAll();
    }

    //Insert new sample result
    public LabResult newSampleResult(LabResult labResult) {
        return labResultRepository.save(labResult);
    }

    //Delete sample result by id
    public void deleteSampleResultById(long id) {
        labResultRepository.deleteById(id);
    }

    public LabResult updateSampleResultById(LabResult labResult, Long id) {
        LabResult result = labResultRepository.findById(id).get();
        if(Objects.nonNull( labResult.getResult())&&
                !"".equalsIgnoreCase( labResult.getResult())){
            result.setResult( labResult.getResult());
        }
        if(Objects.nonNull( labResult.getLabSample())&&
                !"".equalsIgnoreCase(String.valueOf(labResult.getLabSample()))){
            result.setLabSample( labResult.getLabSample());
        }
        if(Objects.nonNull( labResult.getTechnician())&&
                !"".equalsIgnoreCase(String.valueOf(labResult.getTechnician()))){
            result.setTechnician( labResult.getTechnician());
        }
        if(Objects.nonNull( labResult.getTestDate()) &&
                !"".equalsIgnoreCase(String.valueOf(labResult.getTestDate()))){
            result.setTestDate( labResult.getTestDate());
        }
        return labResultRepository.save(result);
    }


}
