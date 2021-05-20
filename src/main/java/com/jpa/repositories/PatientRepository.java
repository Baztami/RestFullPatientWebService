package com.jpa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.*;


public interface PatientRepository extends JpaRepository<Patient,Long> {

}
