package com.api.prueba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="user")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private String email;
    
    @Column
    private String contact;

    @ManyToOne
    @JoinColumn(name="id_habilidades")
    HabilidadesModel habilidades;
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id=id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getContact(){
        return contact;
    }
    
    public void setContact(String contact){
        this.contact=contact;
    }

    public HabilidadesModel getHabilidades(){
        return habilidades;
    }

    public void setHabilidades(HabilidadesModel habilidades){
        this.habilidades=habilidades;
    }
}
