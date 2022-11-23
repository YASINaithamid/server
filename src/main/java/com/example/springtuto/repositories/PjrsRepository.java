
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Pjrs;

@Repository
public interface PjrsRepository extends JpaRepository<Pjrs, Integer> {

}
