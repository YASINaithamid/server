
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Groupe;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Integer> {

}
