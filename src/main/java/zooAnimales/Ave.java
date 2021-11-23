package zooAnimales;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitad, String genero, String colorPlumas) {
        super(nombre, edad, habitad, genero);
        this.colorPlumas = colorPlumas;
        this.listado.add(this);
    }
    public Ave(){
        listado.add(this);
    }
    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave ave = new Ave(nombre, edad, "montanas" ,genero, "cafe glorioso");
        halcones++;
        return ave;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave ave = new Ave(nombre, edad, "montanas" ,genero, "blanco y amarillo");
        aguilas++;
        return ave;
    }
>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d
}
