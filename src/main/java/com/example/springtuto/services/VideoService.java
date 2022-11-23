
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Video;

import com.example.springtuto.repositories.VideoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    // Get All Articles
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    // Get Blog By Id
    public Optional<Video> findById(int id) {
        return videoRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        videoRepository.deleteById(id);
    }

    // Update Blog
    public Video save(Video them) {
        return videoRepository.save(them);
    }

}
