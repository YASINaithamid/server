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
@Table(name = "videos")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idb")
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

    // foreign keys
    @Column(name = "iduserv")
    private Integer userId;

    @Column(name = "idtma")
    private Integer themId;

    @Column(name = "idda")
    private Integer dossierId;

    @Column(name = "etatvideo")
    private Integer videoState;

    @Column(name = "wappb")
    private Integer wappb;

    @Column(name = "etatsmsvideo")
    private Integer smsVideoState;

    @Column(name = "themevideo")
    private String themeVideo;

    @Column(name = "titrevideo")
    private String videoTitle;

    @Column(name = "lienvideo")
    private String videoLink;

    @Column(name = "datevideo")
    private LocalDate videoDate;

    @Column(name = "lienvideoext")
    private String videoExtLink;

    @Column(name = "contenuvideo")
    private String videoContent;

    @Column(name = "dateinsertvideo")
    private LocalDate inserVideoDate;

    @Column(name = "smsvideo")
    private String smsVideo;
}
