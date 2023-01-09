package com.example.springtuto.models;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "articlesv")
public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idarticlev")
        private Integer id;

        @ManyToMany()
        @JoinTable(name = "articles_pays", joinColumns = {
                        @JoinColumn(name = "idarticlev")
        }, inverseJoinColumns = {
                        @JoinColumn(name = "idpysa")
        })
        private List<Pays> pays;

        @OneToMany(mappedBy = "article")
        private List<Pj> piecesJoints;

        // @JsonIgnore is used here to avoid cyclic dependency
        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "iduserv", insertable = false, updatable = false)
        private User user;

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "idlga", insertable = false, updatable = false)
        private Langue langue;

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "idinca", insertable = false, updatable = false)
        private Incidence incidence;

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "idda", insertable = false, updatable = false)
        private Dossier dossier;

        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "iddga", insertable = false, updatable = false)
        private Degre degre;

        // foreign keys
        @Column(name = "iduserv")
        private Integer userId;

        @Column(name = "idtma")
        private Integer themId;

        @Column(name = "idda")
        private Integer dossierId;

        @Column(name = "idpya")
        private Integer PaysId;

        @Column(name = "idlga")
        private Integer langueId;

        @Column(name = "idinca")
        private Integer incidenceId;

        @Column(name = "iddga")
        private Integer degreId;

        @Column(name = "etatarticlev")
        private Integer articleState;// null

        @Column(name = "etatsms")
        private Integer smsState;// null

        @Column(name = "wappa")
        private Integer wappa;// lien whatsapp

        // propre attributes
        @Column(name = "titrearticlev")
        private String articleTitle;

        @Column(name = "isflushn",columnDefinition = "boolean default false")
        private Boolean isFlush;

        @Column(name = "photoarticlev")
        private String articlePhoto;

        @Column(name = "resumearticlev")
        private String articleResume;

        
        @Column(name = "contenuarticlev")//
        private String articleContent;

        @Column(name = "datearticlev")
        private LocalDateTime articleDate ;
       

        @Column(name = "auteurarticlev")
        private String articleAuthor;

        @Column(name = "linkarticlev")
        private String articleLink;

        @Column(name = "faarticlev")
        private String articleFa;// fichier attachee

        @Column(name = "dateinserta")
        private ZonedDateTime   insertDate = ZonedDateTime.now();

}
