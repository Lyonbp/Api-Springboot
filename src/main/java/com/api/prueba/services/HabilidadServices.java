package com.api.prueba.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.prueba.models.HabilidadesModel;
import com.api.prueba.repositories.IHabilidadRepository;

@Service
public class HabilidadServices {
    @Autowired
    IHabilidadRepository habilidadRepository;

    public ArrayList<HabilidadesModel> getHabilidades(){
        return(ArrayList<HabilidadesModel>)habilidadRepository.findAll();
    }

    public HabilidadesModel saveHabilidades(HabilidadesModel habilidades){
        return habilidadRepository.save(habilidades);
    }
}
