package com.example.springtuto.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "themea")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtma")
    private Integer id;

    @OneToMany(mappedBy = "theme")
    List<Image> images;

    @OneToMany(mappedBy = "theme")
    List<Video> videos;

    @OneToMany(mappedBy = "theme")
    List<Rs> socialMedias;

    @OneToMany(mappedBy = "theme")
    List<Blog> blogs;

    @OneToMany(mappedBy = "theme")
    List<Dossier> dossiers;

    @Column(name = "tma")
    private String theme;

}
