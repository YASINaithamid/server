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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dossiera")
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idda")
    private Integer id;

    // oneToMany relation between dossier and blogs
    @OneToMany(mappedBy = "dossier")
    private List<Blog> blogs;

    @ManyToOne
    @JoinColumn(name = "idtma", insertable = false, updatable = false)
    private Theme theme;

    // foreign keys
    @Column(name = "idtma")
    private Integer themId;

    // proper attributes
    @Column(name = "da")
    private String dossierName;

}
