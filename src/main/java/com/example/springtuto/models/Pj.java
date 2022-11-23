package com.example.springtuto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pj")
public class Pj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpj")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idarticlev", insertable = false, updatable = false)
    private Article article;

    // foreign keys
    @Column(name = "idarticlev")
    private Integer articleId;

    // proper attributes
    @Column(name = "tpj")
    private String textPiecesJoints;

    @Column(name = "pj")
    private String piecesJoints;

}
