package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.Register;
import com.hospitalManagement.hospital.entity.Security;
import com.hospitalManagement.hospital.repository.RegisterRepository;
import com.hospitalManagement.hospital.repository.SecurityRepository;
import com.hospitalManagement.hospital.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Component
public class SecurityServiceImpl {

    @Autowired
    RegisterRepository registerRepository;

    @Autowired
    SecurityRepository securityRepository;

    @Autowired
    ShiftRepository shiftRepository;


    public List<Register> listAllSecurity() {
//        return registerRepository.listAllSecurity();
        return null;
    }

    public List<Security> listAllSecurityReport() {
        return securityRepository.findAll();
    }

    public Security addReport(Security security) {
        return securityRepository.save(security);
    }

    public Security updateReport(Security security, Long id) {
        Security s=securityRepository.findById(id).get();
        if(Objects.nonNull(security.getReport())&&
                !"".equalsIgnoreCase(security.getReport())){
            s.setReport(security.getReport());
        }
        if(Objects.nonNull(security.getDate())&&
                !"".equalsIgnoreCase(String.valueOf(security.getDate()))){
            s.setDate(security.getDate());
        }
        return securityRepository.save(s);
    }

    public void deleteReport(Long id) {
        securityRepository.deleteById(id);
    }

    public Optional<Security> getReportById(Long id) {

        return securityRepository.findById(id);
    }


//    public List<Shift> listAllSecurityShift() {
//        return  shiftRepository.listALLSecurityShift();
//
//    }
}
