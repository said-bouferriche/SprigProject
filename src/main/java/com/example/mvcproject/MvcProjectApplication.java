package com.example.mvcproject;

import com.example.mvcproject.entities.Patient;
import com.example.mvcproject.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MvcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {

            patientRepository.save(
                new Patient(null, "titi", new Date(),true,87));
            patientRepository.save(
                new Patient(null, "jaka", new Date(),false,9));
            patientRepository.save(
                new Patient(null, "mino", new Date(),true,45));
            patientRepository.save(
                new Patient(null, "poro", new Date(),false,36));
            patientRepository.save(
                new Patient(null, "titi", new Date(),true,87));
            patientRepository.save(
                new Patient(null, "jaka", new Date(),false,9));
            patientRepository.save(
                new Patient(null, "mino", new Date(),true,45));
            patientRepository.save(
                new Patient(null, "poro", new Date(),false,36));
            patientRepository.save(
                new Patient(null, "titi", new Date(),true,87));
            patientRepository.save(
                new Patient(null, "jaka", new Date(),false,9));
            patientRepository.save(
                new Patient(null, "mino", new Date(),true,45));
            patientRepository.save(
                new Patient(null, "poro", new Date(),false,36));

            patientRepository.findAll().forEach(patient -> {
                System.out.println(patient.getName());
            });

            List<Patient> a =  patientRepository.findByNameStartingWith("ti");

            a.forEach(aa->{
                System.out.println(aa.getId());
            });

        };
    }
}
