package com.jpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entities.Patient;
import com.jpa.repositories.PatientRepository;

@SpringBootApplication(scanBasePackages="com.jpa")

public class JpaApplication  implements CommandLineRunner{
	
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 
		
		patientRepository.save(new Patient(null,"bazta",new Date(),2300,false));
		patientRepository.save(new Patient(null,"luis",new Date(),100,false));
		patientRepository.save(new Patient(null,"jack",new Date(),200,false));
		patientRepository.save(new Patient(null,"enzo",new Date(),230,false));
		patientRepository.findAll().forEach(p->{
			
			 System.out.println(p.toString());
		});	
		
		
	}

}
