package test;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
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
}
