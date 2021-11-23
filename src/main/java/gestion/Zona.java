package gestion;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import zooAnimales.*
public class Zona {
	private String nombre;
	private Zologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zologico zoo ) {
		this.nombre nombre= nombre;
		this.zoo = zoo;
	}
	public Zona() {}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	
	public List<Animal> getAnimales() {
		return animales;
		
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
=======

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


>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d
}
