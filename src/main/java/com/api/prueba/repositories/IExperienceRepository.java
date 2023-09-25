package com.api.prueba.repositories;

import org.springframework.stereotype.Repository;
import com.api.prueba.models.ExperienceModal;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IExperienceRepository extends JpaRepository<ExperienceModal, Long >{
    
}
