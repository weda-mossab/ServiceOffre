package com.iset.serviceoffre_emploi.repositories;

import com.iset.serviceoffre_emploi.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre,Long> {
    
}
