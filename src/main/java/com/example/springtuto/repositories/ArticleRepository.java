package com.example.springtuto.repositories;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springtuto.models.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    @Query(value = "SELECT * FROM articlesv a WHERE a.idtma=:idtma ", nativeQuery = true)
    List<Article> findListArticlesByThemeId(@Param("idtma") Integer idtma);

    @Query(value = "SELECT * FROM articlesv a WHERE a.dateinserta >:dateinserta", nativeQuery = true)
    List<Article> findByCreationDate(@Param("dateinserta") ZonedDateTime date);

}
