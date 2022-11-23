
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
import com.example.springtuto.models.Pj;
import com.example.springtuto.services.PjService;

@RestController
public class PjController {
    @Autowired
    private PjService pjService;

    // Get All Countrys
    @GetMapping("/pjs")
    public List<Pj> findAll() {

        return pjService.findAll();
    }

    @GetMapping("/pjs/{id}")
    public Optional<Pj> findById(@PathVariable(name = "id") Integer id) {
        return pjService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/pjs/add")
    public Pj addNew(@RequestBody Pj article) {

        return pjService.save(article);
    }

    /*
     * @PutMapping(value = "/pjs/update/{id}")
     * public pj update(@RequestBody pj article, @PathVariable Integer id)
     * {
     * 
     * return pjService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/pjs/delete/{id}")
    public String delete(@PathVariable Integer id) {
        pjService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/pjs/update")
    public Pj update(@RequestBody Pj pj) {
        return pjService.save(pj);
    }
}
