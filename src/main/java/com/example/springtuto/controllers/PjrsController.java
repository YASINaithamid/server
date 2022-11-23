
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

import com.example.springtuto.models.Pjrs;
import com.example.springtuto.services.PjrsService;

@RestController
public class PjrsController {
    @Autowired
    private PjrsService pjrsService;

    // Get All Countrys
    @GetMapping("/pjrs")
    public List<Pjrs> findAll() {

        return pjrsService.findAll();
    }

    @GetMapping("/pjrs/{id}")
    public Optional<Pjrs> findById(@PathVariable(name = "id") Integer id) {
        return pjrsService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/pjrs/add")
    public Pjrs addNew(@RequestBody Pjrs article) {

        return pjrsService.save(article);
    }

    /*
     * @PutMapping(value = "/pjrs/update/{id}")
     * public Pjrs update(@RequestBody Pjrs article, @PathVariable Integer id) {
     * 
     * return pjrsService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/pjrs/delete/{id}")
    public String delete(@PathVariable Integer id) {
        pjrsService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/pjrs/update")
    public Pjrs update(@RequestBody Pjrs pjrs) {
        return pjrsService.save(pjrs);
    }
}
