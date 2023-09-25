package com.api.prueba.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.prueba.models.EstudiosModel;
import com.api.prueba.repositories.IEstudiosRepository;

@Service
public class EstudiosServices {
    @Autowired
    IEstudiosRepository estudiosRepository;

    public ArrayList<EstudiosModel>getEstudios(){
        return(ArrayList<EstudiosModel>)estudiosRepository.findAll();
    }

    public EstudiosModel saveEstudios(EstudiosModel estudios){
        return estudiosRepository.save(estudios);
    }

    public Optional<EstudiosModel> getEstudiosID(Long idEstudios){
        return estudiosRepository.findById(idEstudios);
    }

    public EstudiosModel updaEstudiosModel(EstudiosModel request,Long idEstudios){
        EstudiosModel estudios= estudiosRepository.findById(idEstudios).get();

        estudios.setCertificados(request.getCertificados());
        estudios.setSuperiores(request.getSuperiores());

        estudiosRepository.save(estudios);
        
        return estudios;
    }

    public Boolean deleteEstudios(Long idEstudios){
        try{
            estudiosRepository.deleteById(idEstudios);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
