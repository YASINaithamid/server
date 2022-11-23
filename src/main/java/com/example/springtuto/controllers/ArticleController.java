package com.example.springtuto.controllers;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springtuto.models.Article;

import com.example.springtuto.services.ArticleService;

@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    // Get All Articles
    @GetMapping("/articles")
    public List<Article> findAll() {

        return articleService.findAll();
    }

    @GetMapping("/articles/{id}")
    public Optional<Article> findById(@PathVariable(name = "id") Integer id) {
        return articleService.findById(id);
    }

    @GetMapping("/articlesByThemes/{themeId}")
    public List<Article> findListArticlesByThemeId(@PathVariable(name = "themeId") Integer themeId) {
        return articleService.findListArticlesByThemeId(themeId);
    }
    @GetMapping("/articlesByDate/{dateCreate}")
    public List<Article> findByCreationDate(@PathVariable(name = "dateCreate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime dateCreate) {
        return articleService.findByCreationDate(dateCreate);
    }

    // Add Country
    @PostMapping(value = "/articles/add")
    public Article addNew(@RequestBody Article article) {

        return articleService.save(article);
    }

    @PutMapping(value = "/articles/update/{id}")
    public Article update(@RequestBody Article article, @PathVariable Integer id) {

        return articleService.update(article, id);
    }

    @DeleteMapping(value = "/articles/delete/{id}")
    public String delete(@PathVariable Integer id) {
        articleService.delete(id);
        return "Article deleted successfully";
    }
}
