package com.example.springtuto.services;


import java.net.URI;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.example.springtuto.models.Article;
import com.example.springtuto.models.Notification;
import com.example.springtuto.repositories.ArticleRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    // Get All Articles

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public List<Article> findListArticlesByThemeId(int themeId) {
        return articleRepository.findListArticlesByThemeId(themeId);
    }
    public List<Article> findByCreationDate(ZonedDateTime dateCreate) {
        return articleRepository.findByCreationDate(dateCreate);
    }

    // Get Article By Id  findByCreationDate

    public Optional<Article> findById(int id) {
        return articleRepository.findById(id);
    }

    // Delete Article

    public void delete(int id) {
        articleRepository.deleteById(id);
    }
   
    // Update Article
    public Article save(Article article) {
  
        String uri ="https://app.nativenotify.com/api/flutter/notification";
        Notification notif=new Notification("1914","1NHip95VbKieTC0DfCcswi",article.getArticleTitle(),article.getArticleResume(),article.getArticlePhoto());
       /*  notif.setBigPictureURL(article.getArticlePhoto());
        notif.setBody(article.getArticleResume());
        notif.setFlutterAppID("1914");
        notif.setTitle(article.getArticleTitle());
        notif.setFlutterAppToken("1NHip95VbKieTC0DfCcswi"); */
        String articleTitle=article.getArticleTitle();
        String artticleResume=article.getArticleResume();
        String artticlePhoto=article.getArticlePhoto();
        HashMap<String, String> notification = new HashMap<String, String>();
        notification.put("flutterAppId", "1914");
        notification.put("flutterAppToken", "1NHip95VbKieTC0DfCcswi");
        notification.put("title", articleTitle);
        notification.put("body", artticleResume);
        notification.put("bigPictureURL",artticlePhoto);
        //System.out.println(notification);
        RestTemplate restTemplate=new RestTemplate();
        HashMap<String, String> request = new HashMap<String, String>(notification);
    
        URI hash =restTemplate.postForLocation(uri,request, restTemplate, HashMap.class);
        System.out.println(hash);
        return articleRepository.save(article);
    }

    // Update Article
    public Article update(Article newArticle, int id) {
        return articleRepository.findById(id).map(article -> {

            article.setArticleAuthor(newArticle.getArticleAuthor());
            article.setArticleContent(newArticle.getArticleAuthor());
            article.setArticleDate(newArticle.getArticleDate());
            article.setArticleFa(newArticle.getArticleFa());
            article.setArticleLink(newArticle.getArticleLink());
            article.setArticlePhoto(newArticle.getArticlePhoto());
            article.setArticleResume(newArticle.getArticleResume());
            article.setArticleState(newArticle.getArticleState());
            article.setArticleTitle(newArticle.getArticleTitle());
            article.setDegreId(newArticle.getDegreId());
            article.setIsFlush(newArticle.getIsFlush());
            article.setDossierId(newArticle.getDossierId());
            article.setIncidenceId(newArticle.getIncidenceId());
            article.setInsertDate(newArticle.getInsertDate());
            article.setLangueId(newArticle.getLangueId());
            article.setPaysId(newArticle.getPaysId());
            article.setSmsState(newArticle.getSmsState());
            article.setThemId(newArticle.getThemId());
            article.setUserId(newArticle.getUserId());
            article.setWappa(newArticle.getWappa());
            return articleRepository.save(article);
        }).orElseGet(() -> {
            newArticle.setId(id);
            return articleRepository.save(newArticle);
        });
    }

}
