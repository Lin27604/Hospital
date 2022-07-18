package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.entity.Security;
import com.hospitalManagement.hospital.serviceImpl.SecurityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class SecurityController {
    @Autowired
    SecurityServiceImpl securityService;

    @GetMapping("/security")
    public List<Register> listAllSecurity(){
        return securityService.listAllSecurity();
    }
//    @GetMapping("/shift")
//    public List<Shift> listAllSecurityShift(){
//        return securityService.listAllSecurityShift();
//    }

    //List Security Report
    @GetMapping("/security/report")
    public List<Security> listAllSecurityReport(){
        return securityService.listAllSecurityReport();
    }
    @PostMapping("/security/report")
    public Security addReport(@RequestBody  Security security){
        return securityService.addReport(security);

    }
    @DeleteMapping("/security/report/{id}")
    public void deleteReport(@PathVariable("id") Long id){
        securityService.deleteReport(id);

    }
    @PutMapping("/security/report/{id}")
    public Security updateReport(@RequestBody Security security, @PathVariable("id") Long id){
        return securityService.updateReport(security,id);

    }
    @GetMapping("/security/report/{id}")
    public Optional<Security> getReportById(@PathVariable("id") Long id){
        return securityService.getReportById(id);

    }

}
