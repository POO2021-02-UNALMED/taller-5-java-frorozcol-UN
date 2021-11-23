<<<<<<< HEAD
package test;
=======
package zooAnimales;

import gestion.Zona;
>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
<<<<<<< HEAD
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public crearCaballo(String nombre, int edad, String genero) {
		this.caballos++;
		this(nombre, edad, genero, true, 4);
		
	}
	public crearLeon(String nombre, int edad, String genero) {
		this.leones++;
		this(nombre, edad, genero, true, 4);
		
	}
	public static List<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
=======
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitad, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitad, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        this.listado.add(this);
    }

    public Mamifero() {
        listado.add(this);
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        return mamifero;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        return mamifero;
    }
>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d
}
