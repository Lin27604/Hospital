package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.LabResult;
import com.hospitalManagement.hospital.entity.LabSample;
import com.hospitalManagement.hospital.repository.LabResultRepository;
import com.hospitalManagement.hospital.repository.LabSampleRepository;
import net.bytebuddy.implementation.Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
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
}
