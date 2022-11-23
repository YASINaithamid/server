
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Degre;

import com.example.springtuto.repositories.DegreRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DegreService {

    @Autowired
    private DegreRepository DegreRepository;

    // Get All Articles
    public List<Degre> findAll() {
        return DegreRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Degre> findById(int id) {
        return DegreRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        DegreRepository.deleteById(id);
    }

    // Update Blog
    public Degre save(Degre degre) {
        return DegreRepository.save(degre);
    }

}
