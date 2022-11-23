
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

import com.example.springtuto.models.Video;

import com.example.springtuto.services.VideoService;

@RestController
public class VideoController {
    @Autowired
    private VideoService videoService;

    // Get All Countrys
    @GetMapping("/videos")
    public List<Video> findAll() {

        return videoService.findAll();
    }

    @GetMapping("/videos/{id}")
    public Optional<Video> findById(@PathVariable(name = "id") Integer id) {
        return videoService.findById(id);
    }

    // Add Country
    @PostMapping(value = "/videos/add")
    public Video addNew(@RequestBody Video article) {

        return videoService.save(article);
    }

    /*
     * @PutMapping(value = "/videos/update/{id}")
     * public Video update(@RequestBody Video article, @PathVariable Integer id) {
     * 
     * return videoService.update(article, id);
     * }
     */

    @DeleteMapping(value = "/videos/delete/{id}")
    public String delete(@PathVariable Integer id) {
        videoService.delete(id);
        return "Article deleted successfully";
    }

    @PutMapping(value = "/videos/update")
    public Video update(@RequestBody Video video) {
        return videoService.save(video);
    }
}
