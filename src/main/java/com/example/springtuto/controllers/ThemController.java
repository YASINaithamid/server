
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

import com.example.springtuto.models.Theme;

import com.example.springtuto.services.ThemService;

@RestController
public class ThemController {
    @Autowired
    private ThemService themeService;

    // Get All Countrys
    @GetMapping("/themes")
    public List<Theme> findAll() {

        return themeService.findAll();
    }

    @GetMapping("/themes/{id}")
    public Optional<Theme> findById(@PathVariable(name = "id") Integer id) {
        return themeService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/themes/add")
    public Theme addNew(@RequestBody Theme article) {

        return themeService.save(article);
    }

    /*
     * @PutMapping(value = "/theme/update/{id}")
     * public Theme update(@RequestBody Theme article, @PathVariable Integer id) {
     * return themeService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/themes/delete/{id}")
    public String delete(@PathVariable Integer id) {
        themeService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/themes/update")
    public Theme update(@RequestBody Theme theme) {
        return themeService.save(theme);
    }
}
