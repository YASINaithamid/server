
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

import com.example.springtuto.models.Incidence;

import com.example.springtuto.services.IncidenceService;

@RestController
public class IncidenceController {
    @Autowired
    private IncidenceService incidenceService;

    // Get All Countrys
    @GetMapping("/incidences")
    public List<Incidence> findAll() {
        return incidenceService.findAll();
    }

    @GetMapping("/incidences/{id}")
    public Optional<Incidence> findById(@PathVariable(name = "id") Integer id) {
        return incidenceService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/incidences/add")
    public Incidence addNew(@RequestBody Incidence article) {

        return incidenceService.save(article);
    }

    /*
     * @PutMapping(value = "/incidences/update/{id}")
     * public Incidence update(@RequestBody Incidence article, @PathVariable Integer
     * id) {
     * 
     * return incidenceService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/incidences/delete/{id}")
    public String delete(@PathVariable Integer id) {
        incidenceService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/incidences/update")
    public Incidence update(@RequestBody Incidence incidence) {
        return incidenceService.save(incidence);
    }
}
