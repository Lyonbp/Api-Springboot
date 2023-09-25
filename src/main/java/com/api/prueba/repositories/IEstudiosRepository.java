package com.api.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.prueba.models.EstudiosModel;

@Repository
public interface IEstudiosRepository extends JpaRepository<EstudiosModel, Long> {
    
}
