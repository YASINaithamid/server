
package com.example.springtuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
