package com.briller.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Patient {
    private Long patientId;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String phoneNo;
    private String raceEthnicity;
    private int fatherIsland;
    private int motherIsland;
    private int country;
    private int regionId;
    private int numChildren;
    private int numPregnancies;
    private int firstPregnancyAge;
    private Boolean pregnancyStatusNow;
    private Boolean nursingStatusNow;
    private String firstMenstrualPeriod;
    private String lastMenstrualPeriod;
    private String familyDoctor;
    private Boolean birthControlStatus;
    private String birthControlTime;
    private Boolean hormonesAndReplacement;
    private Boolean previous_Mammogram;
    private String previousMammogram_Where;
    private String dates_of_Examination; // validate the date type and number of parameters to pass
    private Boolean breastBiopsy;
    private String biopsyMalignancy;
    private int noOfBiopsy;
    private String diagnosisDetail;
    private Boolean geneticTesting;
    private String genes;
    private String presentBreastComplaint;
    private Boolean routineCheckupStatus;
    private Boolean skinDimplingStatus;
    private Boolean nippleRetractionStatus;
    private Boolean dischargeStatus;
    private String dischargeColor;
    private Boolean familyBreastCancerHistoryStatus;
    private Boolean bcMotherStatus;
    private Boolean bcFatherSideGrandMotherStatus;
    private Boolean bcSisterStatus;
    private Boolean bcMotherSideGrandMotherStatus;
    private Boolean bcMotherSideAuntStatus;
    private Boolean bcFatherSideAuntStatus;
    private Boolean prostateCancer;
    private Boolean pcFatherStatus;
    private Boolean pcBrotherStatus;
    private Boolean pcCousinStatus;
    private Boolean pcUncleStatus;
    private Boolean pcGrandFatherStatus;
    private Boolean previousBreastSurgeryStatus;
    private Date previousBreastSurgeryDate;
    private String previousBreastSurgery;
    private Boolean previousBreastRadiationStatus;
    private Date previousBreastRadiationDate;
    private String previousBreastRadiation;
    private Boolean previousChemotherapyStatus;
    private String previousChemotherapyCondition;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdDt;
    private LocalDateTime updatedDt;
    private String technician_Notes;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_patient_id_seq")
    @SequenceGenerator(name = "patient_patient_id_seq",sequenceName = "patient_patient_id_seq", allocationSize = 1)
    @Column(name="patient_id")
    public Long getPatientId(){ return patientId;}
    public void setPatientId(Long patientId){this.patientId = patientId;}

    @Basic
    @Column(name="first_name")
    public String getFirstName(){ return firstName; }
    public void setFirstName(String firstName){ this.firstName = firstName;}

    @Basic
    @Column(name="middle_name")
    public String getMiddleName(){ return middleName; }
    public void setMiddleName(String middleName){ this.middleName = middleName;}

    @Basic
    @Column(name="last_name")
    public String getLastName(){ return lastName; }
    public void setLastName(String lastName){ this.lastName = lastName;}

    @Basic
    @Column(name="dob")
    public Date getDateOfBirth(){return dateOfBirth;}
    public void setDateOfBirth(Date dateOfBirth){this.dateOfBirth=dateOfBirth;}

    @Basic
    @Column(name="phone_number")
    public String getPhoneNo(){return phoneNo;}
    public void setPhoneNo(String phoneNo){this.phoneNo=phoneNo;}


    @Basic
    @Column(name="race_ethnicity")
    public String getRaceEthnicity(){ return raceEthnicity; }
    public void setRaceEthnicity(String raceEthnicity){ this.raceEthnicity = raceEthnicity;}

    @Basic
    @Column(name = "fatherIsland")
    public int getFatherIsland(){ return fatherIsland; }
    public void setFatherIsland(int fatherIsland){this.fatherIsland=fatherIsland;}

    @Basic
    @Column(name = "motherIsland")
    public int getMotherIsland(){ return motherIsland; }
    public void setMotherIsland(int motherIsland){this.motherIsland=motherIsland;}

    @Basic
    @Column(name = "country")
    public int getCountry(){ return country; }
    public void setCountry(int country){this.country=country;}

    @Basic
    @Column(name = "region_id")
    public int getRegionId(){ return regionId; }
    public void setRegionId(int regionId){this.regionId=regionId;}

    @Basic
    @Column(name="num_of_children")
    public int getNumChildren(){return numChildren;}
    public void setNumChildren(int numChildren){this.numChildren=numChildren;}

    @Basic
    @Column(name="num_of_pregnancies")
    public int getNumPregnancies(){return numPregnancies;}
    public void setNumPregnancies(int numPregnancies){this.numPregnancies=numPregnancies;}

    @Basic
    @Column(name = "first_pregnancy_age")
    public int getFirstPregnancyAge(){return firstPregnancyAge;}
    public void setFirstPregnancyAge(int firstPregnancyAge){this.firstPregnancyAge=firstPregnancyAge;}

    @Basic
    @Column(name="pregnancy_status_now")
    public Boolean getPregnancyStatusNow(){return pregnancyStatusNow;}
    public void setPregnancyStatusNow(Boolean pregnancyStatusNow){this.pregnancyStatusNow=pregnancyStatusNow;}

    @Basic
    @Column(name="nursing_status_now")
    public Boolean getNursingStatusNow(){return nursingStatusNow;}
    public void setNursingStatusNow(Boolean nursingStatusNow){this.nursingStatusNow=nursingStatusNow;}

    @Basic
    @Column(name="firstMenstrual_period")
    public String getFirstMenstrualPeriod(){return firstMenstrualPeriod;}
    public void setFirstMenstrualPeriod(String firstMenstrualPeriod){this.firstMenstrualPeriod=firstMenstrualPeriod;}

    @Basic
    @Column(name="diagnosisDetail")
    public String getDiagnosisDetail(){return diagnosisDetail;}
    public void setDiagnosisDetail(String diagnosisDetail){this.diagnosisDetail=diagnosisDetail;}

    @Basic
    @Column(name="last_menstrual_period")
    public String getLastMenstrualPeriod(){return lastMenstrualPeriod;}
    public void setLastMenstrualPeriod(String lastMenstrualPeriod){this.lastMenstrualPeriod=lastMenstrualPeriod;}

    @Basic
    @Column(name = "family_doctor")
    public String getFamilyDoctor(){return familyDoctor;}
    public void setFamilyDoctor(String familyDoctor){this.familyDoctor=familyDoctor;}

    @Basic
    @Column(name="birth_control_status")
    public Boolean getBirthControlStatus(){return birthControlStatus;}
    public void setBirthControlStatus(Boolean birthControlStatus){this.birthControlStatus=birthControlStatus;}

    @Basic
    @Column(name="birth_control_time")
    public String getBirthControlTime(){return birthControlTime;}
    public void setBirthControlTime(String birthControlTime){this.birthControlTime = birthControlTime;}

    @Basic
    @Column(name="hormones_and_replacement")
    public Boolean getHormonesAndReplacement(){return hormonesAndReplacement;}
    public void setHormonesAndReplacement(Boolean hormonesAndReplacement){this.hormonesAndReplacement = hormonesAndReplacement;}

    @Basic
    @Column(name="bcFatherSideGrandMotherStatus")
    public Boolean getBcFatherSideGrandMotherStatus(){return bcFatherSideGrandMotherStatus;}
    public void setBcFatherSideGrandMotherStatus(Boolean bcFatherSideGrandMotherStatus){this.bcFatherSideGrandMotherStatus = bcFatherSideGrandMotherStatus;}

    @Basic
    @Column(name="previous_mammogram")
    public Boolean getPrevious_Mammogram(){return previous_Mammogram;}
    public void setPrevious_Mammogram(Boolean previous_Mammogram){this.previous_Mammogram=previous_Mammogram;}


    @Basic
    @Column(name = "previous_mammogram_where")
    public String getPreviousMammogram_Where(){return previousMammogram_Where;}
    public void setPreviousMammogram_Where(String previousMammogram_Where){this.previousMammogram_Where=previousMammogram_Where;}

    @Basic
    @Column(name = "dates_of_examination")
    public String getDates_of_Examination(){return dates_of_Examination;}
    public void setDates_of_Examination(String dates_of_Examination){this.dates_of_Examination=dates_of_Examination;}

    @Basic
    @Column(name="breastBiopsy")
    public Boolean getBreastBiopsy(){return breastBiopsy;}
    public void setBreastBiopsy(Boolean breastBiopsy){this.breastBiopsy=breastBiopsy;}

    @Basic
    @Column(name="biopsy_malignancy")
    public String getBiopsyMalignancy(){return  biopsyMalignancy;}
    public void setBiopsyMalignancy(String biopsyMalignancy){this.biopsyMalignancy=biopsyMalignancy;}

    @Basic
    @Column(name = "no_of_biopsy")
    public int getNoOfBiopsy(){ return noOfBiopsy; }
    public void setNoOfBiopsy(int noOfBiopsy){this.noOfBiopsy=noOfBiopsy;}


    @Basic
    @Column(name="genetic_testing")
    public Boolean getGeneticTesting(){return  geneticTesting;}
    public void setGeneticTesting(Boolean geneticTesting){this.geneticTesting=geneticTesting;}


    @Basic
    @Column(name = "genes")
    public String getGenes(){return genes;}
    public void setGenes(String genes){this.genes=genes;}


    @Basic
    @Column(name="previous_breast_surgery_status")
    public Boolean getPreviousBreastSurgeryStatus(){return previousBreastSurgeryStatus;}
    public void setPreviousBreastSurgeryStatus(Boolean previousBreastSurgeryStatus){this.previousBreastSurgeryStatus=previousBreastSurgeryStatus;}

    @Basic
    @Column(name="previous_breast_surgery_date")
    public Date getPreviousBreastSurgeryDate(){return previousBreastSurgeryDate;}
    public void setPreviousBreastSurgeryDate(Date previousBreastSurgeryDate){this.previousBreastSurgeryDate=previousBreastSurgeryDate;}

    @Basic
    @Column(name="previous_breast_surgery")
    public String getPreviousBreastSurgery(){return previousBreastSurgery;}
    public void setPreviousBreastSurgery(String previousBreastSurgery){this.previousBreastSurgery=previousBreastSurgery;}

    @Basic
    @Column(name="previous_breast_radiation_status")
    public Boolean getPreviousBreastRadiationStatus(){return previousBreastRadiationStatus;}
    public void setPreviousBreastRadiationStatus(Boolean previousBreastRadiationStatus){this.previousBreastRadiationStatus=previousBreastRadiationStatus;}

    @Basic
    @Column(name="previous_breast_radiation_date")
    public Date getPreviousBreastRadiationDate(){return previousBreastRadiationDate;}
    public void setPreviousBreastRadiationDate(Date previousBreastRadiationDate){this.previousBreastRadiationDate=previousBreastRadiationDate;}

    @Basic
    @Column(name="previous_breast_radiation")
    public String getPreviousBreastRadiation(){return previousBreastRadiation;}
    public void setPreviousBreastRadiation(String previousBreastRadiation){this.previousBreastRadiation=previousBreastRadiation;}

    @Basic
    @Column(name="previous_chemotherapy_status")
    public Boolean getPreviousChemotherapyStatus(){return previousChemotherapyStatus;}
    public void setPreviousChemotherapyStatus(Boolean previousChemotherapyStatus){this.previousChemotherapyStatus=previousChemotherapyStatus;}

    @Basic
    @Column(name="previous_chemotherapy_condition")
    public String getPreviousChemotherapyCondition(){return previousChemotherapyCondition;}
    public void setPreviousChemotherapyCondition(String previousChemotherapyCondition){this.previousChemotherapyCondition=previousChemotherapyCondition;}

    @Basic
    @Column(name="routine_check_up_status")
    public Boolean getRoutineCheckupStatus(){return routineCheckupStatus;}
    public void setRoutineCheckupStatus(Boolean routineCheckupStatus){this.routineCheckupStatus=routineCheckupStatus;}

    @Basic
    @Column(name="present_breast_complaint")
    public String getPresentBreastComplaint(){return presentBreastComplaint;}
    public void setPresentBreastComplaint(String presentBreastComplaint){this.presentBreastComplaint=presentBreastComplaint;}

    @Basic
    @Column(name="skin_dimpling_status")
    public Boolean getSkinDimplingStatus(){return skinDimplingStatus;}
    public void setSkinDimplingStatus(Boolean skinDimplingStatus){this.skinDimplingStatus=skinDimplingStatus;}

    @Basic
    @Column(name="nipple_retraction_status")
    public Boolean getNippleRetractionStatus(){return nippleRetractionStatus;}
    public void setNippleRetractionStatus(Boolean nippleRetractionStatus){this.nippleRetractionStatus=nippleRetractionStatus;}

    @Basic
    @Column(name="discharge_status")
    public Boolean getDischargeStatus(){return dischargeStatus;}
    public void setDischargeStatus(Boolean dischargeStatus){this.dischargeStatus=dischargeStatus;}

    @Basic
    @Column(name="discharge_color")
    public String getDischargeColor(){return dischargeColor;}
    public void setDischargeColor(String dischargeColor){this.dischargeColor=dischargeColor;}

    @Basic
    @Column(name="family_breast_cancer_history_status")
    public Boolean getFamilyBreastCancerHistoryStatus(){return familyBreastCancerHistoryStatus;}
    public void setFamilyBreastCancerHistoryStatus(Boolean familyBreastCancerHistoryStatus){this.familyBreastCancerHistoryStatus=familyBreastCancerHistoryStatus;}

    @Basic
    @Column(name="bc_mother_status")
    public Boolean getBcMotherStatus(){return bcMotherStatus;}
    public void setBcMotherStatus(Boolean bcMotherStatus){this.bcMotherStatus=bcMotherStatus;}


    @Basic
    @Column(name="bc_sister_status")
    public Boolean getBcSisterStatus(){return bcSisterStatus;}
    public void setBcSisterStatus(Boolean bcSisterStatus){this.bcSisterStatus=bcSisterStatus;}

    @Basic
    @Column(name="bc_mother_side_grand_mother_status")
    public Boolean getBcMotherSideGrandMotherStatus(){return bcMotherSideGrandMotherStatus;}
    public void setBcMotherSideGrandMotherStatus(Boolean bcMotherSideGrandMotherStatus){this.bcMotherSideGrandMotherStatus=bcMotherSideGrandMotherStatus;}

    @Basic
    @Column(name="bc_mother_side_aunt_status")
    public Boolean getBcMotherSideAuntStatus(){return bcMotherSideAuntStatus;}
    public void setBcMotherSideAuntStatus(Boolean bcMotherSideAuntStatus){this.bcMotherSideAuntStatus=bcMotherSideAuntStatus;}

    @Basic
    @Column(name="bc_father_side_aunt_status")
    public Boolean getBcFatherSideAuntStatus(){return bcFatherSideAuntStatus;}
    public void setBcFatherSideAuntStatus(Boolean bcFatherSideAuntStatus){this.bcFatherSideAuntStatus=bcFatherSideAuntStatus;}

    @Basic
    @Column(name = "technician_notes")
    public String getTechnician_Notes(){return technician_Notes;}
    public void setTechnician_Notes(String technician_Notes){this.technician_Notes=technician_Notes;}

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "created_dt")
    @CreatedDate
    public LocalDateTime getCreatedDt() {
        return createdDt;
    }
    public void setCreatedDt(LocalDateTime createdDt) {
        this.createdDt = createdDt;
    }

    @Basic
    @Column(name = "updated_dt")
    @LastModifiedDate
    public LocalDateTime getUpdatedDt() {
        return updatedDt;
    }
    public void setUpdatedDt(LocalDateTime updatedDt) {
        this.updatedDt = updatedDt;
    }

}