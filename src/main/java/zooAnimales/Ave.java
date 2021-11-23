package zooAnimales;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas; 
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public Ave() {
		listado.add(this);
	}
	public static int  cantidadAves() {
		return listado.size();
	}
	public crearAves(String nombre, int edad, String genero) {
		this(nombre, edad, genero,);
		
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
	
	@Override
	public String movimiento() {
		return "Volar";
	}
}
