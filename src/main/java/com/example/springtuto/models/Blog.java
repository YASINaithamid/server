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
@Table(name = "blog")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Blog {
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

    @Column(name = "etatblog")
    private Integer blogState;

    @Column(name = "wappb")
    private Integer wappb;

    @Column(name = "etatsmsb")
    private Integer blogSmsState;

    @Column(name = "titreblog")
    private String blogTitle;

    @Column(name = "msg")
    private String message;

    @Column(name = "lienblog")
    private String blogLink;

    @Column(name = "dateblog")
    private LocalDate blogDate;

    @Column(name = "dateinsertb")
    private LocalDate insertBlogDate;

    @Column(name = "smsb")
    private String blogSms;

}
