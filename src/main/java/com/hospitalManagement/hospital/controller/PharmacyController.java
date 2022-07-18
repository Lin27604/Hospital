package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Building;
import com.hospitalManagement.hospital.entity.Department;
import com.hospitalManagement.hospital.entity.MedOrder;
import com.hospitalManagement.hospital.entity.Medicine;
import com.hospitalManagement.hospital.serviceImpl.BuildingServiceImpl;
import com.hospitalManagement.hospital.serviceImpl.DepartmentServiceImpl;
import com.hospitalManagement.hospital.serviceImpl.MedicineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PharmacyController {

    @Autowired
    BuildingServiceImpl buildingServiceImpl;
    @Autowired
    DepartmentServiceImpl departmentServiceImpl;
    @Autowired
    MedicineServiceImpl medicineService;

//
//    @GetMapping("/building")
//    public List<Building> getAllBuildings(){
//
//        return buildingServiceImpl.getAllBuildings();
//    }
//    @DeleteMapping("deleteBuilding/{id}")
//    public void deleteBuildingById(@PathVariable("id") Long id){
//
//        buildingServiceImpl.deleteBuildingById(id);
//    }
//
//    @PostMapping("/newDepartment")
//    public Department saveDepartment(@RequestBody Department depart){
//        return departmentServiceImpl.saveDepartment(depart);
//
//    }


    //Medicine Management
    @PostMapping("/AddMedicine")
    public Medicine addMedicine(@RequestBody Medicine medicine){

        return medicineService.addMedicine(medicine);
    }

    @GetMapping("/listMedicine")
    public List<Medicine> getAllMedicine(){

        return medicineService.getAllMedicine();
    }
    @DeleteMapping("deleteMedicine/{id}")
    public void deleteMedicineById(@PathVariable("id") Long id){

        medicineService.deleteMedicineById(id);
    }
    @PutMapping("/updateMedicine/{id}")
    public Medicine updateMed(@PathVariable("id") Long medicineId, @RequestBody Medicine medicine){
        return medicineService.updateMed(medicineId, medicine);
    }

    //insert new Medicine Order
    @PostMapping("/Add/MedicineOrder")
    public MedOrder addMedOrder(@RequestBody MedOrder medOrder){
        return medicineService.addMedOrder(medOrder);
    }

    //List all Medicine order
    @GetMapping("/list/MedicineOrder")
    public List<MedOrder> listALlMedOrder(){
        return medicineService.listALlMedOrder();
    }

    //Delete an medicine order by id
    @DeleteMapping("delete/MedicineOrder/{id}")
    public void deleteMedOrderById(@PathVariable("id") Long id){
        medicineService.deleteMedOrderById(id);

    }



}
