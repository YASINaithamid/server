
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

import com.example.springtuto.models.Degre;

import com.example.springtuto.services.DegreService;

@RestController
public class DegreController {
    @Autowired
    private DegreService degreService;

    // Get All Countrys
    @GetMapping("/degres")
    public List<Degre> findAll() {

        return degreService.findAll();
    }

    @GetMapping("/degres/{id}")
    public Optional<Degre> findById(@PathVariable(name = "id") Integer id) {
        return degreService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/degres/add")
    public Degre addNew(@RequestBody Degre article) {

        return degreService.save(article);
    }

    /*
     * @PutMapping(value = "/Degres/update/{id}")
     * public Degre update(@RequestBody Degre article, @PathVariable Integer id)
     * {
     * 
     * return degreService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/degres/delete/{id}")
    public String delete(@PathVariable Integer id) {
        degreService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/degres/update")
    public Degre update(@RequestBody Degre degre) {
        return degreService.save(degre);
    }
}
