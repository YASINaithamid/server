
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Langue;

import com.example.springtuto.repositories.LangueRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LangueService {

    @Autowired
    private LangueRepository langueRepository;

    // Get All Articles

    public List<Langue> findAll() {
        return langueRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Langue> findById(int id) {
        return langueRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        langueRepository.deleteById(id);
    }

    // Update Blog
    public Langue save(Langue inci) {
        return langueRepository.save(inci);
    }

}
