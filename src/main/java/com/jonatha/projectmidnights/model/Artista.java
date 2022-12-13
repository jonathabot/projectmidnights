package com.jonatha.projectmidnights.model;

import javax.persistence.*;

@Entity
@Table(name = "ARTISTA")
public class Artista {

    private int id;

    private Long idArtista;
    private String nome;
    private String urlImg;
    private String albumsDoArtista;

    public Artista() {
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Long idArtista) {
        this.idArtista = idArtista;
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

    public String getAlbumsDoArtista() {
        return albumsDoArtista;
    }

    public void setAlbumsDoArtista(String albumsDoArtista) {
        this.albumsDoArtista = albumsDoArtista;
    }
}
