package com.example.activite2.web;

import com.example.activite2.Entity.Patient;
import com.example.activite2.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepo patientRepo;

    @GetMapping(path = "/user/patients")
    public String patients(Model model,
                           @RequestParam(name="page", defaultValue = "0") int page,
                           @RequestParam(name="size", defaultValue = "5") int size,
                           @RequestParam(name="key", defaultValue = "") String key,
                           @RequestParam(name="malade", defaultValue = "") String malade,
                           @RequestParam(name="genre", defaultValue = "") String genre,
                           @RequestParam(name="score", defaultValue = "1") int score){



        Page<Patient> pagePatient;
        if (malade.equals("on") || malade.equals("off")) {
            if (score > 1)
                pagePatient = patientRepo.findByNomContainsAndMaladeAndGenreContainsAndScoreEquals(key, malade.equals("on")?true:false, genre, score, PageRequest.of(page,size));
            else
                pagePatient = patientRepo.findByNomContainsAndMaladeAndGenreContains(key, malade.equals("on")?true:false, genre, PageRequest.of(page,size));
        }else{
            if (score > 1)
                pagePatient = patientRepo.findByNomContainsAndGenreContainsAndScoreEquals(key, genre, score, PageRequest.of(page,size));
            else
                pagePatient = patientRepo.findByNomContainsAndGenreContains(key, genre, PageRequest.of(page,size));
        }
        model.addAttribute("patients", pagePatient.getContent());
        model.addAttribute("pages", new int[pagePatient.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("key", key);
        model.addAttribute("malade", malade);
        model.addAttribute("genre", genre);
        model.addAttribute("score", score);
        return "patients";
    }

    @GetMapping("/admin/PatientForm")
    public String PatientForm(Model model){
        model.addAttribute("patient", new Patient());
        return "PatientForm";
    }

    @GetMapping("/admin/delete")
    public String delete(Long id, String key, int page)
    {
        patientRepo.deleteById(id);
        return "redirect:/user/patients?page="+page+"&key="+key;
    }

    @PostMapping("/admin/save")
    public String Save(Model model, @Valid Patient p, BindingResult bindingResult,
                       @RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String key)
    {
        if (bindingResult.hasErrors()) return "PatientForm";
        patientRepo.save(p);
        return "redirect:/user/patients?page="+page+"&key="+key;
    }

    @GetMapping("/admin/update")
    public String Update(Model model, Long id, int page, String key)
    {
        Patient p = patientRepo.findById(id).orElse(null);
        if (p == null) throw new RuntimeException("No such Patient");

        model.addAttribute("patient", p);
        model.addAttribute("page", page);
        model.addAttribute("key", key);

        return "editPatient";
    }

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

}
