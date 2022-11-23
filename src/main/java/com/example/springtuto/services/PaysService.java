
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Pays;

import com.example.springtuto.repositories.PaysRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PaysService {

    @Autowired
    private PaysRepository paysRepository;

    // Get All Articles
    public List<Pays> findAll() {
        return paysRepository.findAll();
    }

    // Get Blog By Id
    public Optional<Pays> findById(int id) {
        return paysRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        paysRepository.deleteById(id);
    }

    // Update Blog
    public Pays save(Pays inci) {
        return paysRepository.save(inci);
    }

}
