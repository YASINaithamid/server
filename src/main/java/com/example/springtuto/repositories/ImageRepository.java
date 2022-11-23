
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {

}
