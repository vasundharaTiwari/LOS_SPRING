package com.los.Controller;

import com.los.Repository.RepoPersonalDetails;
import com.los.model.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerPersonal
{
    @Autowired
    private RepoPersonalDetails repoPersonalDetails;

    @PostMapping("/save")
    public ResponseEntity<String> savePersonalInfo(@RequestBody List<PersonalDetails> personalDetails)
    {repoPersonalDetails.saveAll(personalDetails);
        return ResponseEntity.ok("Data saved");
            }


}
