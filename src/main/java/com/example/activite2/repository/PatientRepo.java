package com.example.activite2.repository;

import com.example.activite2.Entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepo extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContains(String key, Pageable pageable);

}
