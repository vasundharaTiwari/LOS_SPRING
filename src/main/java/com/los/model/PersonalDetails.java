package com.los.model;

import jakarta.persistence.*;
import lombok.Getter;


@Entity

public class PersonalDetails {

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long ID;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Getter
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

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    private String branch_name;

    private String ro_name;
    private String submit_date;
    private String ApplicationID;
    private String Customer_type;

    @OneToOne(cascade = CascadeType.ALL)
    private IdentificationDetails identificationDetails;


}
