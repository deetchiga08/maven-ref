package com.briller.service;

import com.briller.model.Patient;
import com.briller.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Description;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Description("service and methods for patient")
@Service
public class PatientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    @Qualifier("postgresJdbcTemplate")
    private JdbcTemplate postgresJdbcTemplate;

    /**
     * details of the patient gets saved in patient table and history table
     * @param patient
     * @return
     */
    public Patient getdataandInsert(Patient patient)
    {

        Patient res = patientRepository.save(patient);
        Long patientId=res.getPatientId();
        try{
        String query = patientRepository.query;
        String value= query.replace("patientId", Long.toString(patientId));
        postgresJdbcTemplate.execute(value);
        LOGGER.info("successFull execution of inserting in history table in patientService"+patientId);
        return res;}
        catch(Exception e)
        {
            LOGGER.error("Error in executing in saving patient data in history table in patientService"+e.getMessage());
            throw  e;
        }
    }

    /**
     * checks if already same user already exists
     * @param firstName
     * @param lastName
     * @param phoneNo
     * @return
     */

    public List<Map<String,Object>> checkpatient(String firstName,String lastName,String phoneNo){
        try{
        List<Map<String, Object>> patient = patientRepository.findBypatient(firstName, lastName, phoneNo);
        LOGGER.info("successFull execution of checkpatient query in patientService for"+firstName+"   "+lastName+"   "+phoneNo);
        return patient;
        }
        catch(Exception e)
        {
            LOGGER.error("error in execution of check patient already exists query in patientService"+e.getMessage());
            throw  e;
        }
    }

    /**
     * to get all region data
     * @return
     */

    public List<Map<String,Object>> getdata(){
        List<Map<String,Object>> regions;
        try{
        String query = "Select * from region";
        regions = postgresJdbcTemplate.queryForList(query);
        LOGGER.info("successFull Execution of getRegions query in PatientService");
        return regions;}
        catch(Exception e)
        {
            LOGGER.error("error in execution of getRegions query in patientService"+e.getMessage());
            throw e;
        }
    }

}
