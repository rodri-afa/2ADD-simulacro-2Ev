package org.example.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Peliculas")
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_pelicula;
    @Column(name = "titulo")
    String titulo;
    @Column(name = "año")
    int año;
    @Column(name = "descripcion")
    String descripcion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_director")
    Director director;

    public Pelicula(){}

    public Pelicula(String titulo, int año, String descripcion, Director director)
    {
        this.id_pelicula=0;
        this.titulo = titulo;
        this.año = año;
        this.descripcion = descripcion;
        this.director = director;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id_pelicula=" + id_pelicula +
                ", titulo='" + titulo + '\'' +
                ", año=" + año +
                ", descripcion='" + descripcion + '\'' +
                ", director=" + director.getNombre() + " " + director.getApellidos() +
                '}';
    }
}
