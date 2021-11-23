package gestion;

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
	
}
