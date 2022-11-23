
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Pj;
import com.example.springtuto.repositories.PjRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PjService {

    @Autowired
    private PjRepository pjRepository;

    // Get All Articles

    public List<Pj> findAll() {
        return pjRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Pj> findById(int id) {
        return pjRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        pjRepository.deleteById(id);
    }

    // Update Blog
    public Pj save(Pj pj) {
        return pjRepository.save(pj);
    }

}
