
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Rs;

@Repository
public interface RsRepository extends JpaRepository<Rs, Integer> {

}
