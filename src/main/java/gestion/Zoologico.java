package gestion;

<<<<<<< HEAD
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>(); 
	
	public  Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public  Zoologico() {}
	
	public void getNombre() {
		return nombre
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void getUbicacion() {
		return ubicacion
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void agregarZona(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int total;
		for (Zona zona : Zonas ) {
			total += zona.cantidadAnimales();
		}
		return total;
		
	}
	
=======
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private  ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public  ArrayList<Zona> getZona() {
        return zonas;
    }

    public  void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int total=0;
        for(Zona zona: zonas){
            total += zona.cantidadAnimales();
        }
        return total;
    }


>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d
}
