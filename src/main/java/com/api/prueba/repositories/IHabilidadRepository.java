package com.api.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.prueba.models.HabilidadesModel;

@Repository
public interface IHabilidadRepository extends JpaRepository<HabilidadesModel, Long>{
    
}
