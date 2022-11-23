
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Degre;

@Repository
public interface DegreRepository extends JpaRepository<Degre, Integer> {

}
