package com.br.email.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.email.entitie.Email;

public interface EmailRepository extends JpaRepository<Email , UUID>{

	Optional<Email> findById(UUID emailId);
    
}
