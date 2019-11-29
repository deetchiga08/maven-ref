package com.briller.repository;


import com.briller.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    String query="insert into history_details (patient_id,first_name,last_name,previous_mammogram,previous_mammogram_where," +
            "dates_of_examination,family_doctor,phone_number,region_id,father_island_id,mother_island_id,num_of_pregnancies,first_pregnancy_age,pregnancy_status_now," +
            "num_of_children,last_menstrual_period,birth_control_status,"+ "birth_control_time,hormones_and_replacement,previous_breast_surgery_status," +
            "previous_breast_surgery_date,previous_breast_surgery,previous_breast_radiation_status,previous_breast_radiation_date," +
            "previous_breast_radiation,previous_chemotherapy_status,previous_chemotherapy_condition,"+
            "routine_check_up_status,present_breast_complaint,skin_dimpling_status,nipple_retraction_status,discharge_status,discharge_color," +
            "family_breast_cancer_history_status,bc_mother_status,bc_daughter_status,bc_sister_status,bc_mother_side_grand_mother_status," +
            "bc_mother_side_aunt_status,bc_father_side_aunt_status,technician_notes,created_by,updated_by,created_dt) "+
            "select patient_id,first_name,last_name,previous_mammogram,previous_mammogram_where,dates_of_examination,family_doctor,phone_number,region_id,"+
            "father_island_id,mother_island_id,num_of_pregnancies,first_pregnancy_age,pregnancy_status_now,num_of_children,last_menstrual_period,birth_control_status,birth_control_time,"+
            "hormones_and_replacement,previous_breast_surgery_status,previous_breast_surgery_date,previous_breast_surgery,previous_breast_radiation_status,"+
            "previous_breast_radiation_date,previous_breast_radiation,previous_chemotherapy_status,previous_chemotherapy_condition,routine_check_up_status,"+
            "present_breast_complaint,skin_dimpling_status,nipple_retraction_status,discharge_status,discharge_color,family_breast_cancer_history_status,"+
            "bc_mother_status,bc_daughter_status,bc_sister_status,bc_mother_side_grand_mother_status,bc_mother_side_aunt_status,bc_father_side_aunt_status,"+
            "technician_notes,created_by,updated_by,updated_dt from patient where patient_id=patientId";

    String query1 = "select first_name ||' '|| last_name|| ' ' || phone_number as displayName, patient_id,first_name,last_name,phone_number,created_dt from patient order by created_dt desc;";

      @Query(value="Select a.*, b.region, c.region as father_island, d.region as mother_island from patient a Left join region b on a.region_id = b.id Left join region c on a.father_island_id=c.id Left join region d on a.mother_island_id=d.id where patient_id = ?1",nativeQuery = true)
    public List<Map<String, Object>> findByCondition(Long patientId);


      @Query(value="select count(*) as exists from patient where first_name=?1 and last_name=?2 and phone_number=?3",nativeQuery = true)
    public List<Map<String,Object>> findBypatient(String firstName, String lastName, String phoneNo);


}
