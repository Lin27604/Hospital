package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.MedOrder;
import com.hospitalManagement.hospital.entity.Medicine;
import com.hospitalManagement.hospital.serviceImpl.BuildingServiceImpl;
import com.hospitalManagement.hospital.serviceImpl.MedicineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/hosp")
public class PharmacyController {

    @Autowired
    BuildingServiceImpl buildingServiceImpl;


    @Autowired
    MedicineServiceImpl medicineService;

    //Medicine Management
    @PostMapping("/medicine")
    public Medicine addMedicine(@RequestBody Medicine medicine){

        return medicineService.addMedicine(medicine);
    }

    @GetMapping("/medicine")
    public List<Medicine> getAllMedicine(){

        return medicineService.getAllMedicine();
    }
    @DeleteMapping("/medicine/{id}")
    public void deleteMedicineById(@PathVariable("id") Long id){

        medicineService.deleteMedicineById(id);
    }
    @PutMapping("/medicine/{id}")
    public Medicine updateMed(@PathVariable("id") Long medicineId, @RequestBody Medicine medicine){
        return medicineService.updateMed(medicineId, medicine);
    }

    //insert new Medicine Order
    @PostMapping("/medicine/order")
    public MedOrder addMedOrder(@RequestBody MedOrder medOrder){
        return medicineService.addMedOrder(medOrder);
    }

    //List all Medicine order
    @GetMapping("/medicine/order")
    public List<MedOrder> listALlMedOrder(){
        return medicineService.listALlMedOrder();
    }

    //Delete an medicine order by id
    @DeleteMapping("/medicine/order/{id}")
    public void deleteMedOrderById(@PathVariable("id") Long id){
        medicineService.deleteMedOrderById(id);

    }
    //update medicine order
    @PutMapping("/medicine/order/{id}")
    public MedOrder updateMedOrderById(@RequestBody MedOrder medOrder, @PathVariable("id") Long id){
        return medicineService.updateMedOrderById(medOrder,id);
    }



}
