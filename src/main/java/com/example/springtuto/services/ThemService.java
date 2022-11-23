
package com.example.springtuto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtuto.models.Theme;
import com.example.springtuto.repositories.ThemRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ThemService {

    @Autowired
    private ThemRepository themRepository;

    // Get All Articles
    public List<Theme> findAll() {
        return themRepository.findAll();
    }

    // Get Blog By Id
    public Optional<Theme> findById(int id) {
        return themRepository.findById(id);
    }

    // Delete Blog
    public void delete(int id) {
        themRepository.deleteById(id);
    }

    // Update Blog
    public Theme save(Theme them) {
        return themRepository.save(them);
    }

}
