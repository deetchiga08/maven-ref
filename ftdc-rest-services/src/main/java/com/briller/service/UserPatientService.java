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

@Description("service for radiologist")
@Service
public class UserPatientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserPatientService.class);

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    @Qualifier("postgresJdbcTemplate")
    private JdbcTemplate postgresJdbcTemplate;

    /**
     * edit option of patient details for radiologist
     * @param patient
     * @return
     */
    public Patient updatePatient(Patient patient)
    {
        Patient res = patientRepository.save(patient);
        Long patientId=res.getPatientId();
        try{
        String query = patientRepository.query;
        String value= query.replace("patientId", Long.toString(patientId));
        postgresJdbcTemplate.execute(value);
        LOGGER.info("query executed successfully and saved in history table in userPatient service"+patientId);
        }
        catch (Exception e){
            LOGGER.error("error in executing query in userPatient serviice"+e.getMessage());
        }
        return res;
    }

    /**
     * list of patients
     * @return
     */
    public List<Map<String,Object>> patientList(){

        try {
            List<Map<String,Object>> data;
            String query = patientRepository.query1;
            data = postgresJdbcTemplate.queryForList(query);
            LOGGER.info("query executed successfully and listed patient list in userPatient service");
            return data;
        }
        catch(Exception e){

            LOGGER.error("error in getting patientlist in userPatientservice"+e.getMessage());
            throw  e;

        }

    }

    /**
     * details of single patient by id
     * @param patientId
     * @return
     */

    public List<Map<String,Object>> patientListById(Long patientId){
        try{
        List<Map<String,Object>> data;
        data = patientRepository.findByCondition(patientId);
            LOGGER.info("listed particular data of patient in userPatient service"+patientId);
        return data;

        }
        catch (Exception e){
            LOGGER.error("error in findByCondition in patientById in userPatientById in userPatient service"+e.getMessage());
            throw  e;

        }
    }

}
