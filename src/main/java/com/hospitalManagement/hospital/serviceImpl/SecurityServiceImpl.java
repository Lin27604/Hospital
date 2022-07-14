package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecurityServiceImpl {

    @Autowired
    RegisterRepository registerRepository;


    public List<Register> listAllSecurity() {
        return registerRepository.listAllSecurity();
    }
}
