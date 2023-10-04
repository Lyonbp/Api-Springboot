package com.api.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "habilidad")
public class HabilidadesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idHabilidad;

    @Column
    private String habilidad;

    @Column
    private String nivel;

    @ManyToOne
    @JoinColumn(name="id_user")
    UserModel user;

    public Long getIdHabilidad(){
        return idHabilidad;
    }

    public void setIdHabilidad(Long idHabilidad){
        this.idHabilidad = idHabilidad;
    }

    public String getHabilidad(){
        return habilidad;
    }

    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNivel(String nivel){
        this.nivel=nivel;
    }

    public UserModel getUsers(){
        return user;
    }

    public void setUsers(UserModel user){
        this.user=user;
    }


}
