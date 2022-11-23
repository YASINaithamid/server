
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Integer> {

}
