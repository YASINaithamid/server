
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Theme;

@Repository
public interface ThemRepository extends JpaRepository<Theme, Integer> {

}
