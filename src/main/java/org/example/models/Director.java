package org.example.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Directores")
public class Director implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_director;
    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellidos")
    String apellidos;
    @Column(name = "origen")
    String origen;
    @OneToMany(mappedBy = "director",cascade = CascadeType.ALL)
    List<Pelicula> peliculas;
    public Director(){}

    public Director(String nombre, String apellidos, String origen) {
        this.id_director=0;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.origen = origen;
        this.peliculas = new ArrayList<>();
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id_director=" + id_director +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", origen='" + origen + '\'' +
                ", peliculas=" + peliculas +
                '}';
    }
}
