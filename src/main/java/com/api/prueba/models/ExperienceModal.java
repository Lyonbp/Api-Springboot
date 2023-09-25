package com.api.prueba.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="experience")
public class ExperienceModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idExperience;

    @Column
    private Date fechaInicio;

    @Column
    private Date fechaTermino;

    @Column
    private String description;

    public Long getExperience(){
        return idExperience;
    }

    public void setExperience(Long idExperience){
        this.idExperience = idExperience;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino(){
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino){
        this.fechaTermino = fechaTermino;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
