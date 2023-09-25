package com.api.prueba.repositories;

import com.api.prueba.models.UserModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    
}

