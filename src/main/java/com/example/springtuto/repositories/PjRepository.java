
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Pj;

@Repository
public interface PjRepository extends JpaRepository<Pj, Integer> {

}
