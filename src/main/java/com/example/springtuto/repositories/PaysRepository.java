package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Integer> {

}
