package com.briller.controller;

import com.briller.model.Patient;
import com.briller.service.PatientService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api("Patient Service for FTDC Questionaire Application")
@RestController
@RequestMapping("/api/patient")
public class PatientController {


    @Autowired
    PatientService patientService;

    /**
     *
     * @param patientDetails
     * @return patientDetails
     */

   @PostMapping("/savePatient")
    public ResponseEntity<Patient> postPatient(@RequestBody Patient patientDetails) {
        Patient res=patientService.getdataandInsert(patientDetails);
        return ResponseEntity.ok(res);

    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param phoneNo
     * @return if exists=0 or more than 0
     */
    @PostMapping("/checkPatients")
    public List<Map<String, Object>> checkPatient(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String phoneNo )
    {
        List<Map<String, Object>> data;
        data= patientService.checkpatient(firstName, lastName, phoneNo);
        return data;
    }

    /**
     *
     * @return all the regions
     */

    @GetMapping("/getRegions")
    public List<Map<String, Object>> getRegions(){
        List<Map<String,Object>> data;
        data=patientService.getdata();
        return data;
    }


    }

