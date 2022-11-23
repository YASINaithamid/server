
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

import com.example.springtuto.models.Blog;
import com.example.springtuto.services.BlogService;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    // Get All Countrys
    @GetMapping("/blogs")
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @GetMapping("/blogs/{id}")
    public Optional<Blog> findById(@PathVariable(name = "id") Integer id) {
        return blogService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/blogs/add")
    public Blog addNew(@RequestBody Blog article) {

        return blogService.save(article);
    }

    @PutMapping(value = "/blogs/update")
    public Blog update(@RequestBody Blog blog) {

        return blogService.save(blog);
    }

    @DeleteMapping(value = "/blogs/delete/{id}")
    public String delete(@PathVariable Integer id) {
        blogService.delete(id);
        return "Article deleted successfully";
    }

    /*
     * @PutMapping(value = "/blogs/update/{id}")
     * public Blog update(@RequestBody Blog article, @PathVariable Integer id) {
     * 
     * return blogService.update(article, id);
     * }
     */
}
