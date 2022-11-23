package com.example.springtuto.models;

import java.time.LocalDate;
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
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rs")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Rs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrs")
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

    // oneToMany relation between dossier and blogs
    @OneToMany(mappedBy = "socialMedia")
    private List<Pjrs> piecesJoints;

    @Column(name = "iduserv")
    private Integer userId;

    @Column(name = "idtma")
    private Integer themId;

    @Column(name = "idda")
    private Integer dossierId;

    @Column(name = "typers")
    private String rsType;

    @Column(name = "msg")
    private String message;

    @Column(name = "smsrs")
    private String rsSms;

    @Column(name = "userrs")
    private String userRs;

    @Column(name = "dateinsertrs")
    private LocalDate rsInsertDate;

    @Column(name = "daters")
    private LocalDate rsDate;

    @Column(name = "lienrs")
    private String rsLink;
    @Column(name = "etatsmsrs")
    private Integer rsSmsState;

    @Column(name = "etatrs")
    private Integer rsState;

    @Column(name = "wapprs")
    private Integer rsWapp;

}
