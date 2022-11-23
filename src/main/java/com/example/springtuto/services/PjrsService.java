
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtuto.models.Pjrs;
import com.example.springtuto.repositories.PjrsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PjrsService {

    @Autowired
    private PjrsRepository pjrsRepository;

    // Get All Articles
    public List<Pjrs> findAll() {
        return pjrsRepository.findAll();
    }

    // Get Blog By Id
    public Optional<Pjrs> findById(int id) {
        return pjrsRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        pjrsRepository.deleteById(id);
    }

    // Update Blog
    public Pjrs save(Pjrs inci) {
        return pjrsRepository.save(inci);
    }

}
