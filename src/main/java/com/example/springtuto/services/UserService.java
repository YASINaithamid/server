
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springtuto.models.User;

import com.example.springtuto.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get All Articles
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Get Blog By Id
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    // Update Blog
    public User save(User them) {
        return userRepository.save(them);
    }

}
