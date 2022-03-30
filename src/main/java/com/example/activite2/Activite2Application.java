package com.example.activite2;

import com.example.activite2.Entity.Patient;
import com.example.activite2.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Activite2Application implements CommandLineRunner {
    @Autowired
    private PatientRepo patientRepo;
    public static void main(String[] args) {

        SpringApplication.run(Activite2Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i<100; i++){
            patientRepo.save(
                    new Patient(null, "hamza_"+(i+1), new Date(), Math.random()>0.5?true:false, (int) (Math.random()*100)));
        }
    }
}
