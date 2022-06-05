package com.pablo.webapi.Domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelicula_id")
    private Long id;

    @Column(length = 50)
    private String titulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    private String poster;
    private String sinopsis;

    public Collection<Funcion> getFunciones() {
        return funciones;
    }

    private String trailer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pelicula")
    private Collection<Funcion> funciones;

}
