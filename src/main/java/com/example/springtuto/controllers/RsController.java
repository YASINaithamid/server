
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

import com.example.springtuto.models.Rs;

import com.example.springtuto.services.RsService;

@RestController
public class RsController {
    @Autowired
    private RsService rsService;

    // Get All Countrys
    @GetMapping("/rs")
    public List<Rs> findAll() {

        return rsService.findAll();
    }

    @GetMapping("/rs/{id}")
    public Optional<Rs> findById(@PathVariable(name = "id") Integer id) {
        return rsService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/rs/add")
    public Rs addNew(@RequestBody Rs article) {

        return rsService.save(article);
    }

    /*
     * @PutMapping(value = "/rs/update/{id}")
     * public Rs update(@RequestBody Rs article, @PathVariable Integer id) {
     * 
     * return rsService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/rs/delete/{id}")
    public String delete(@PathVariable Integer id) {
        rsService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/rs/update")
    public Rs update(@RequestBody Rs rs) {
        return rsService.save(rs);
    }

}
