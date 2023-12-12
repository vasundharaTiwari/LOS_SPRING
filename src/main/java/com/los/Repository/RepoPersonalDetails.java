package com.los.Repository;

import com.los.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPersonalDetails extends JpaRepository <PersonalDetails,Long>{
}
