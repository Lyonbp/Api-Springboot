package com.api.prueba.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.prueba.models.ExperienceModal;
import com.api.prueba.services.ExperienceServices;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    
    @Autowired
    private ExperienceServices experienceServices;
    @GetMapping
    public ArrayList<ExperienceModal>getExperience(){
        return this.experienceServices.getExperience();
    }

    @PostMapping
    public ExperienceModal saveExperience(@RequestBody ExperienceModal experience){
        return this.experienceServices.saveExperience(experience);
    }

    @GetMapping(path = "/{id}")
    public Optional<ExperienceModal> getExperienceId(@PathVariable("id") Long idExperience) {
        return this.experienceServices.getExperienceID(idExperience);
    }

    @PutMapping(path = "/{id}")
    public ExperienceModal updateExperience(@RequestBody ExperienceModal request,@PathVariable("id") Long idExperience){
        return this.experienceServices.updateExperienceModal(request, idExperience);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteExperience(@PathVariable("id") Long idExperience){
        boolean ok = this.experienceServices.deteExperience(idExperience);

        if(ok){
            return "Usuario con el " + idExperience + " eliminado";
        }else{
            return "Error, no se elimino el usuario con el id :" + idExperience ;
        }
    }
}
