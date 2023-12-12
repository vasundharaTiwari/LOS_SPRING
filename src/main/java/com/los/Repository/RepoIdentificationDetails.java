package com.los.Repository;

import com.los.model.IdentificationDetails;
import com.los.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoIdentificationDetails  extends JpaRepository<IdentificationDetails,Long> {
}
