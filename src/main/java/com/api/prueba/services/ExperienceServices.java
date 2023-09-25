package com.api.prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.prueba.models.ExperienceModal;
import com.api.prueba.repositories.IExperienceRepository;

@Service
public class ExperienceServices {
    @Autowired
    IExperienceRepository experienceRepository;

    public ArrayList<ExperienceModal> getExperience(){
        return(ArrayList<ExperienceModal>)experienceRepository.findAll();
    }

    public ExperienceModal saveExperience(ExperienceModal experience){
        return experienceRepository.save(experience);
    }

    public Optional<ExperienceModal>getExperienceID(Long idExperience){
        return experienceRepository.findById(idExperience);
    }

    public ExperienceModal updateExperienceModal(ExperienceModal request,Long idExperience){
        ExperienceModal experience = experienceRepository.findById(idExperience).get();

        experience.setFechaInicio(request.getFechaInicio());
        experience.setFechaTermino(request.getFechaTermino());
        experience.setDescription(request.getDescription());

        experienceRepository.save(experience);

        return experience;
    }

    public Boolean deteExperience(Long idExperience){
        try {
            experienceRepository.deleteById(idExperience);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
