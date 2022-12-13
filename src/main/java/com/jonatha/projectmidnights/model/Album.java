package com.jonatha.projectmidnights.model;

import javax.persistence.*;

@Entity
@Table(name = "ALBUM")
public class Album {
    private int id;

    private Long idAlbum;
    private String nome;
    private String urlImg;
    private String musicasDoAlbum;

    public Album() {
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        this.idAlbum = idAlbum;
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

    public String getMusicasDoAlbum() {
        return musicasDoAlbum;
    }

    public void setMusicasDoAlbum(String musicasDoAlbum) {
        this.musicasDoAlbum = musicasDoAlbum;
    }
}
