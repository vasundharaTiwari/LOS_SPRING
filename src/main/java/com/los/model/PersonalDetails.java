package com.los.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long ID;
    private String salutation;
    private String firstName;
    private String  middleName;
    private String  lastName;
    private String gender;
    private String dob;
    private String mobileNo;
    private String permanentAddress;
    private String permanentVillage;
    private String permanentBlock;
    private String permanentPin;
    private String permanentDistrict;
    private String permanentState;

    private String correspondenceAddress;
    private String correspondenceVillage;
    private String correspondenceBlock;
    private String correspondencePin;
    private String correspondenceDistrict;
    private String correspondenceState;
    private String cif;
    private String filled_by;
    private String branch_code;
    private String branch_name;
    private String ro_name;
    private String submit_date;
    private String ApplicationID;
    private String Customer_type;


}
