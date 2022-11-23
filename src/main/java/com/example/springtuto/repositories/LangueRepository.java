
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Langue;

@Repository
public interface LangueRepository extends JpaRepository<Langue, Integer> {

}
