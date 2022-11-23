
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

import com.example.springtuto.models.Pays;

import com.example.springtuto.services.PaysService;

@RestController
public class PaysController {
    @Autowired
    private PaysService paysService;

    // Get All Countrys
    @GetMapping("/pays")
    public List<Pays> findAll() {

        return paysService.findAll();
    }

    @GetMapping("/pays/{id}")
    public Optional<Pays> findById(@PathVariable(name = "id") Integer id) {
        return paysService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/pays/add")
    public Pays addNew(@RequestBody Pays pays) {
        return paysService.save(pays);
    }

    /*
     * @PutMapping(value = "/pays/update/{id}")
     * public Pays update(@RequestBody Pays article, @PathVariable Integer id) {
     * return paysService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/pays/delete/{id}")
    public String delete(@PathVariable Integer id) {
        paysService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/pays/update")
    public Pays update(@RequestBody Pays pays) {
        return paysService.save(pays);
    }
}
