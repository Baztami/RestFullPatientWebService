package com.jpa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entities.Patient;
import com.jpa.repositories.PatientRepository;

@RestController
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	@GetMapping("/patients")
	public List<Patient> patients() {
		return patientRepository.findAll();
		
	}
	

}
