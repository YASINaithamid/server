
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Image;
import com.example.springtuto.repositories.ImageRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    // Get All Articles

    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Image> findById(int id) {
        return imageRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        imageRepository.deleteById(id);
    }

    // Update Blog
    public Image save(Image dossier) {
        return imageRepository.save(dossier);
    }

}
