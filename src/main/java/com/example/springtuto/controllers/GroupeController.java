
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

import com.example.springtuto.models.Groupe;
import com.example.springtuto.services.GroupSrevice;

@RestController
public class GroupeController {
    @Autowired
    private GroupSrevice groupSrevice;

    // Get All Countrys
    @GetMapping("/groupes")
    public List<Groupe> findAll() {

        return groupSrevice.findAll();
    }

    @GetMapping("/groupes/{id}")
    public Optional<Groupe> findById(@PathVariable(name = "id") Integer id) {
        return groupSrevice.findById(id);
    }

    // Add Country
    @PostMapping(value = "/groupes/add")
    public Groupe addNew(@RequestBody Groupe article) {
        return groupSrevice.save(article);
    }

    /*
     * @PutMapping(value = "/groupes/update/{id}")
     * public Groupe update(@RequestBody Groupe article, @PathVariable Integer id) {
     * return groupSrevice.update(article, id);
     * }
     */

    @DeleteMapping(value = "/groupes/delete/{id}")
    public String delete(@PathVariable Integer id) {
        groupSrevice.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/groupes/update")
    public Groupe update(@RequestBody Groupe groupe) {
        return groupSrevice.save(groupe);
    }
}
