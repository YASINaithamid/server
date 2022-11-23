
package com.example.springtuto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.springtuto.models.Dossier;

import com.example.springtuto.services.DossierService;

@RestController
public class DossierController {
    @Autowired
    private DossierService dossierService;

    // Get All Countrys
    @GetMapping("/dossiers")
    public List<Dossier> findAll() {

        return dossierService.findAll();
    }

    @GetMapping("/dossiers/{id}")
    public Optional<Dossier> findById(@PathVariable(name = "id") Integer id) {
        return dossierService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/dossiers/add")
    public Dossier addNew(@RequestBody Dossier article) {

        return dossierService.save(article);
    }

    /*
     * @PutMapping(value = "/dossiers/update/{id}")
     * public Dossier update(@RequestBody Dossier article, @PathVariable Integer id)
     * {
     * 
     * return dossierService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/dossiers/delete/{id}")
    public String delete(@PathVariable Integer id) {
        dossierService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/dossiers/update")
    public Dossier update(@RequestBody Dossier dossier) {
        return dossierService.save(dossier);
    }
}
