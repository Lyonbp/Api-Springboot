package com.api.prueba.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.prueba.models.HabilidadesModel;
import com.api.prueba.services.HabilidadServices;

@RestController
@RequestMapping("/habilidad")
public class HabilidadesController {
    
    @Autowired
    private HabilidadServices habilidadServices;

    @GetMapping
    public ArrayList<HabilidadesModel>getHabilidadesModels(){
        return this.habilidadServices.getHabilidades();
    }

    @PostMapping
    public HabilidadesModel savHabilidades(@RequestBody HabilidadesModel habilidades){
        return this.habilidadServices.saveHabilidades(habilidades);
    }
}
