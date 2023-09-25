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

import com.api.prueba.models.EstudiosModel;
import com.api.prueba.services.EstudiosServices;

@RestController
@RequestMapping("/estudios")
public class EstudiosController {
    @Autowired
    private EstudiosServices estudiosServices;
    @GetMapping
    public ArrayList<EstudiosModel>getEstudios(){
        return this.estudiosServices.getEstudios();
    }

    @PostMapping
    public EstudiosModel saveEstudios(@RequestBody EstudiosModel estudios){
        return this.estudiosServices.saveEstudios(estudios);
    }

    @GetMapping(path = "/{id}")
    public Optional<EstudiosModel>getEstudios(@PathVariable("id") Long idEstudios){
        return this.estudiosServices.getEstudiosID(idEstudios);
    }

    @PutMapping(path = "/{id}")
    public EstudiosModel updateEstudios(@PathVariable("id") Long idEstudios,@RequestBody EstudiosModel request){
        return this.estudiosServices.updaEstudiosModel(request, idEstudios);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEstudios(@PathVariable("id") Long idEstudios){
        boolean ok=this.estudiosServices.deleteEstudios(idEstudios);

        if(ok){
            return "Usuario con el " + idEstudios + " eliminado";
        }else{
            return "Error, no se elimino el usuario con el id :" + idEstudios ;
        }
    }
}
