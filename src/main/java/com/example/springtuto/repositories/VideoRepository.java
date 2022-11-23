
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

}
