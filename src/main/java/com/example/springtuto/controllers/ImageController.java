
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

import com.example.springtuto.models.Image;
import com.example.springtuto.services.ImageService;

@RestController
public class ImageController {
    @Autowired
    private ImageService imageService;

    // Get All Countrys
    @GetMapping("/images")
    public List<Image> findAll() {

        return imageService.findAll();
    }

    @GetMapping("/images/{id}")
    public Optional<Image> findById(@PathVariable(name = "id") Integer id) {
        return imageService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/images/add")
    public Image addNew(@RequestBody Image article) {
        return imageService.save(article);
    }

    /*
     * @PutMapping(value = "/images/update/{id}")
     * public Image update(@RequestBody Image article, @PathVariable Integer id) {
     * return imageService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/images/delete/{id}")
    public String delete(@PathVariable Integer id) {
        imageService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/images/update")
    public Image update(@RequestBody Image image) {
        return imageService.save(image);
    }
}
