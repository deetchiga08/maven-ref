package com.briller.controller;

import com.briller.Response.ftdcResponse;
import com.briller.model.Patient;
import com.briller.service.UserPatientService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Api("Radiologist Service on patients for FTDC Questionaire Application")
@RestController
@RequestMapping("/api/user")
public class UserPatientController {

    @Autowired
    UserPatientService userPatientService;


    /**
     *
     * @param patientDetails (updating parameter can be given in response body)
     * @return updated details of patient
     */
    @PostMapping("/updatePatient")
    public ResponseEntity<Patient> postPatient(@RequestBody Patient patientDetails) {
        Patient res=userPatientService.updatePatient(patientDetails);
        return ResponseEntity.ok(res);

    }

    /**
     *
     * @return all the patient details in desc order
     */

    @GetMapping("/PatientList")
    public List<Map<String,Object>> getPatientList(){
        List<Map<String,Object>> data;
        data=userPatientService.patientList();
        return data;
    }

    /**
     *
     * @param patientId (get patient details by id)
     * @return data of particular patient
     */
    @GetMapping("/patient")
    public ResponseEntity<?> getBypatientId(@RequestParam Long patientId){

        List<Map<String, Object>> patient = userPatientService.patientListById(patientId);

        if(patient==null)
        {
            return new ResponseEntity<>(new ftdcResponse( "false","No patient in this id"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new ftdcResponse( patient,"data for the particular patient"), HttpStatus.OK);}

    }

}

