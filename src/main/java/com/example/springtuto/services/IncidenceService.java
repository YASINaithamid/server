
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtuto.models.Incidence;

import com.example.springtuto.repositories.IncidenceRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class IncidenceService {

    @Autowired
    private IncidenceRepository incidenceRepository;

    // Get All Articles

    public List<Incidence> findAll() {
        return incidenceRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Incidence> findById(int id) {
        return incidenceRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        incidenceRepository.deleteById(id);
    }

    // Update Blog
    public Incidence save(Incidence inci) {
        return incidenceRepository.save(inci);
    }

}
