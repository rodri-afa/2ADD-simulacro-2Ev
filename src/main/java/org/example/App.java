package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import org.example.models.Director;
import org.example.models.Pelicula;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    @PersistenceUnit(name="persistencia")
    public  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
    public static EntityManager manager = emf.createEntityManager();


    public static void main( String[] args )
    {
//        Director d1=crearDirector("Quentin","Tarantino","US");
//        crearPelicula("Pulp Fiction",1994,"Whose motorbike is this? Zed's. Who's Zed? Zed's Dead, baby",d1);
//        mostrarDirectores();
//        Director directorBuscado = buscarDirector();
//        añadirPeliculaADirector("Los odiosos 8", 2015,"el cazarrecompensas John Ruth viaja con su fugitiva Daisy Domergue a Red Rock, donde Ruth entregará a la mujer a la justicia.",directorBuscado);
        mostrarDirectores();
    }


    public static Director crearDirector(String nombre, String apellidos, String origen){

        Director director = new Director(nombre,apellidos,origen);
        manager.getTransaction().begin();
        manager.persist(director);
        manager.getTransaction().commit();

        return director;
    }

    public static void crearPelicula(String titulo,int año,String  descripcion,Director director){

        Pelicula pelicula = new Pelicula(titulo,año,descripcion,director);
        manager.getTransaction().begin();
        manager.persist(pelicula);
        manager.getTransaction().commit();
    }

    public static void mostrarDirectores(){
        String hql = "FROM Director";
        manager.getTransaction().begin();

        ArrayList<Director> directores = (ArrayList<Director>) manager.createQuery(hql).getResultList();

        for (Director d: directores) {
            System.out.println(d);
        }
        manager.getTransaction().commit();

    }

    public static void añadirPeliculaADirector(String titulo, int año, String descripcion, Director director){
        manager.getTransaction().begin();
        Pelicula peli = new Pelicula(titulo,año,descripcion,director);
        manager.persist(peli);
        manager.getTransaction().commit();

    }

    public static Director buscarDirector (int id){
        manager.getTransaction().begin();
        Director director = manager.find(Director.class,id);
        manager.getTransaction().commit();
        return director;
    }


}
