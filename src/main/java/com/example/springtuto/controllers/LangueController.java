
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
import com.example.springtuto.models.Langue;

import com.example.springtuto.services.LangueService;

@RestController
public class LangueController {
    @Autowired
    private LangueService langueService;

    // Get All Countrys
    @GetMapping("/langues")
    public List<Langue> findAll() {

        return langueService.findAll();
    }

    @GetMapping("/langues/{id}")
    public Optional<Langue> findById(@PathVariable(name = "id") Integer id) {
        return langueService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/langues/add")
    public Langue addNew(@RequestBody Langue article) {

        return langueService.save(article);
    }

    /*
     * @PutMapping(value = "/langues/update/{id}")
     * public Langue update(@RequestBody Langue article, @PathVariable Integer id) {
     * 
     * return langueService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/langues/delete/{id}")
    public String delete(@PathVariable Integer id) {
        langueService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/langues/update")
    public Langue update(@RequestBody Langue langue) {
        return langueService.save(langue);
    }
}
