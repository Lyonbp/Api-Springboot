package com.api.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudios")
public class EstudiosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idEstudios;

    @Column(name="est_certificado")
    private String certificados;

    @Column(name = "est_superiores")
    private String superiores;


    public Long getEstudios(){
        return  idEstudios;
    }

    public void setEstudios(Long idEstudios) {
        this.idEstudios = idEstudios;
    }

    public String getCertificados(){
        return certificados;
    }

    public void setCertificados(String certificados){
        this.certificados=certificados;
    }

    public String getSuperiores(){
        return superiores;
    }

    public void setSuperiores(String superiores){
        this.superiores=superiores;
    }

}
