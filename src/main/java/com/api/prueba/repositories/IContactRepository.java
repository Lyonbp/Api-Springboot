package com.api.prueba.repositories;

import com.api.prueba.models.ContactModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IContactRepository extends JpaRepository<ContactModel, Long>{
    
}
