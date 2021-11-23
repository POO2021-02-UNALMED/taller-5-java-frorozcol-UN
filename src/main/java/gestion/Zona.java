package gestion;

import java.util.ArrayList;
import java.util.List;
import zooAnimales.Animal;
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private  ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona() {
        zoo = new Zoologico();
        zoo.agregarZonas(this);
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public  void setAnimales(ArrayList<Animal> animales) {
        animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public  ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }


}
