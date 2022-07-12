package com.hospitalManagement.hospital.controller;

import com.hospitalManagement.hospital.entity.Record;
import com.hospitalManagement.hospital.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Record postOrUpdateRecord(@RequestBody Record record) {
        return recordService.insertOrUpdateRecord(record);
    }

}
