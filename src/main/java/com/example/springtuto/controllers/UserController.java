
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
import com.example.springtuto.models.User;
import com.example.springtuto.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // Get All Countrys
    @GetMapping("/users")
    public List<User> findAll() {

        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> findById(@PathVariable(name = "id") Integer id) {
        return userService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/users/add")
    public User addNew(@RequestBody User article) {

        return userService.save(article);
    }

    /*
     * @PutMapping(value = "/users/update/{id}")
     * public User update(@RequestBody User article, @PathVariable Integer id) {
     * 
     * return userService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/users/delete/{id}")
    public String delete(@PathVariable Integer id) {
        userService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/users/update")
    public User update(@RequestBody User user) {
        return userService.save(user);
    }
}
