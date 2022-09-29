package com.example.mvcproject.repositories;

import com.example.mvcproject.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findByNameStartingWith(String st);

    Page<Patient> findByNameContains(String st,Pageable pageable);
}
