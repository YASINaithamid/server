
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Dossier;

@Repository
public interface DossierRepository extends JpaRepository<Dossier, Integer> {

}
