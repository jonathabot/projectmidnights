package com.jonatha.projectmidnights.model;

import javax.persistence.*;

@Entity
@Table(name = "GRAVADORA")
public class Gravadora {

    private int id;

    private Long idGravadora;
    private String nome;
    private String urlImg;
    private String artistasDaGravadora;

    public Gravadora() {
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdGravadora() {
        return idGravadora;
    }

    public void setIdGravadora(Long idGravadora) {
        this.idGravadora = idGravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getArtistasDaGravadora() {
        return artistasDaGravadora;
    }

    public void setArtistasDaGravadora(String artistasDaGravadora) {
        this.artistasDaGravadora = artistasDaGravadora;
    }
}
