
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtuto.models.Rs;

import com.example.springtuto.repositories.RsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RsService {

    @Autowired
    private RsRepository rsRepository;

    // Get All Articles
    public List<Rs> findAll() {
        return rsRepository.findAll();
    }

    // Get Blog By Id
    public Optional<Rs> findById(int id) {
        return rsRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        rsRepository.deleteById(id);
    }

    // Update Blog
    public Rs save(Rs inci) {
        return rsRepository.save(inci);
    }

}
