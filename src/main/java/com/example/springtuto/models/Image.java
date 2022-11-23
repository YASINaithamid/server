package com.example.springtuto.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "images")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idimg")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "iduserv", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "idtma", insertable = false, updatable = false)
    private Theme theme;

    @ManyToOne
    @JoinColumn(name = "idda", insertable = false, updatable = false)
    private Dossier dossier;

    @Column(name = "iduserv")
    private Integer userId;

    @Column(name = "idtma")
    private Integer themId;

    @Column(name = "idda")
    private Integer dossierId;

    @Column(name = "themeimg")
    private String imageTheme;

    @Column(name = "titreimg")
    private String imageTitle;

    @Column(name = "lienimg")
    private String imageLink;

    @Column(name = "lienimageext")
    private String imageLinkExt;

    @Column(name = "dateimg")
    private LocalDate imageDate;

    @Column(name = "dateinsertimg")
    private LocalDate dateInsertImage;

    @Column(name = "smsimg")
    private String imageSms;

    @Column(name = "contenuimg")
    private String imageContent;

    @Column(name = "etatimg")
    private Integer ImageState;

    @Column(name = "wappi")
    private Integer wappi;

    @Column(name = "etatsmsimg")
    private Integer imageSmsState;

}
