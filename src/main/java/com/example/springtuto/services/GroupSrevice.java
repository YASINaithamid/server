
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Groupe;

import com.example.springtuto.repositories.GroupeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroupSrevice {

    @Autowired
    private GroupeRepository groupeRepository;

    // Get All Articles

    public List<Groupe> findAll() {
        return groupeRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Groupe> findById(int id) {
        return groupeRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        groupeRepository.deleteById(id);
    }

    // Update Blog
    public Groupe save(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

}
