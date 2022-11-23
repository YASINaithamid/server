
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtuto.models.Dossier;
import com.example.springtuto.repositories.DossierRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DossierService {

    @Autowired
    private DossierRepository dossierRepository;

    // Get All Articles

    public List<Dossier> findAll() {
        return dossierRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Dossier> findById(int id) {
        return dossierRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        dossierRepository.deleteById(id);
    }

    // Update Blog
    public Dossier save(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

}
