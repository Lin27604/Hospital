package com.hospitalManagement.hospital.serviceImpl;

import com.hospitalManagement.hospital.entity.MedOrder;
import com.hospitalManagement.hospital.entity.Medicine;
import com.hospitalManagement.hospital.repository.MedOrderRepository;
import com.hospitalManagement.hospital.repository.MedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class MedicineServiceImpl {
    @Autowired
    MedRepository medRepository;
    @Autowired
    MedOrderRepository medOrderRepository;

    public Medicine addMedicine(Medicine medicine)
    {
        return medRepository.save(medicine);
    }

    public List<Medicine> getAllMedicine() {
        return  medRepository.findAll();
    }

    public void deleteMedicineById(Long id) {
        medRepository.deleteById(id);
    }

    public Medicine updateMed(Long medicineId, Medicine medicine) {
        Medicine med= medRepository.findById(medicineId).get();
        if(Objects.nonNull(medicine.getCategory())&&
        !"".equalsIgnoreCase(medicine.getCategory())){
            med.setCategory(medicine.getCategory());
        }
        if(Objects.nonNull(medicine.getName())&&
                !"".equalsIgnoreCase(medicine.getName())){
            med.setName(medicine.getName());
        }
        if(Objects.nonNull(medicine.getPrice())&&
                !"".equalsIgnoreCase(String.valueOf(medicine.getPrice()))){
            med.setPrice(medicine.getPrice());
        }
        if(Objects.nonNull(medicine.getQuantity())&&
                !"".equalsIgnoreCase(String.valueOf(medicine.getQuantity()))){
            med.setQuantity(medicine.getQuantity());
        }
        return medRepository.save(med);


    }

    //Insert Medicine order
    public MedOrder addMedOrder(MedOrder medOrder) {
        return medOrderRepository.save(medOrder);
    }

    //List all medicine order
    public List<MedOrder> listALlMedOrder() {
        return medOrderRepository.findAll();
    }
    //delete a medicine order by id
    public void deleteMedOrderById(Long id) {
        medOrderRepository.deleteById(id);
    }

    public MedOrder updateMedOrderById(MedOrder medOrder, Long id) {
        MedOrder medOrder1 = medOrderRepository.findById(id).get();
        if(Objects.nonNull(medOrder.getQuantity())&&
                !"".equalsIgnoreCase(medOrder.getQuantity())){
            medOrder1.setQuantity(medOrder.getQuantity());
        }
        if(Objects.nonNull(medOrder.getMedicine())&&
                !"".equalsIgnoreCase(String.valueOf(medOrder.getMedicine()))){
             medOrder1.setMedicine(medOrder.getMedicine());
        }
        if(Objects.nonNull(medOrder.getDeliveryStatu())&&
                !"".equalsIgnoreCase(String.valueOf(medOrder.getDeliveryStatu()))){
            medOrder1.setDeliveryStatu(medOrder.getDeliveryStatu());
        }
        if(Objects.nonNull(medOrder.getPatient())&&
                !"".equalsIgnoreCase(String.valueOf(medOrder.getPatient()))){
            medOrder1.setPatient(medOrder.getPatient());
        }
        if(Objects.nonNull(medOrder.getTotal())&&
                !"".equalsIgnoreCase(medOrder.getTotal())){
            medOrder1.setTotal(medOrder.getTotal());
        }
        return medOrderRepository.save(medOrder1);

    }
}
