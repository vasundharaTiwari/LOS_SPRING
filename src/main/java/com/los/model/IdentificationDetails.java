package com.los.model;

import jakarta.persistence.*;

@Entity
public class IdentificationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long identification_id;
    private String aadhar;
    private String pan;
    private String drivingLicence ;
    private String voterId;
    private String passportId;
    private String rationCard;
    @OneToOne(mappedBy = "identificationDetails")
    private PersonalDetails personalDetails;






}
