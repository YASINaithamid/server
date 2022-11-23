
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.Blog;
import com.example.springtuto.repositories.BlogRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    // Get All Articles

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    // Get Blog By Id

    public Optional<Blog> findById(int id) {
        return blogRepository.findById(id);
    }

    // Delete Blog

    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    // Update Blog
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

}
