package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.serviceImpl.SecurityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SecurityController {
    @Autowired
    SecurityServiceImpl securityService;

    @GetMapping("/security")
    public List<Register> listAllSecurity(){
        return securityService.listAllSecurity();
    }
}
