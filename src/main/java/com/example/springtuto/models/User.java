package com.example.springtuto.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilisateursv")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduserv")
    private Integer id;

    // oneToMany relation between user and articles
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Article> articles;

    // oneToMany relation between user and images
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Image> images;

    // oneToMany relation between user and rs
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Rs> socialMdias;

    // oneToMany relation between user and videos
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Video> videos;

    // oneToMany relation between user and blogs
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Blog> blogs;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idgroupev", insertable = false, updatable = false)
    private Groupe groupe;

    @Column(name = "idgroupev")
    private Integer groupId;

    @Column(name = "etatuserv")
    private Integer userState;

    @Column(name = "tentative")
    private Integer tentative;

    @Column(name = "loginv")
    private String login;

    @Column(name = "pwdv")
    private String password;

    @Column(name = "droituser")
    private String userRole;

}
