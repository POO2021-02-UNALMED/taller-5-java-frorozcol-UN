package zooAnimales;

<<<<<<< HEAD
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad; 
	private String habitad;
	private String genero;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		totalAnimales++;
	}
	public Animal() {
		totalAnimales++;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public String movimiento() {
		return "desplazarse";
	}
	
	
	public String toString() {
		if (zona == null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
		else {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+
					", la zona en la que me ubico es "+zona+" en el "+zona.getZoologico();
		}
	
=======
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitad;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitad = habitad;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal() {
        totalAnimales++;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitad;
    }

    public void setHabitat (String habitad) {
        this.habitad = habitad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZonas() {
        return zona;
    }

    public void setZonas(Zona zonas) {
        this.zona = zonas;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        int totalMamiferos = Mamifero.cantidadMamiferos();
        int totalAves = Ave.cantidadAves();
        int totalReptiles = Reptil.cantidadReptiles();
        int totalPeces = Pez.cantidadPeces();
        int totalAnfibios = Anfibio.cantidadAnfibios();

        String animalPorTipo = "Mamiferos: " + totalMamiferos + "\n"
                + "Aves: " + totalAves + "\n"
                + "Reptiles: " + totalReptiles + "\n"
                + "Peces: " + totalPeces + "\n"
                + "Anfibios: " + totalAnfibios;

        return animalPorTipo;
    }



    @Override
    public String toString() {
        String string =  ""
                + "Mi nombre es "+nombre+", tengo una edad de "+edad+", "
                + "habito en "+habitad+" y mi genero es "+genero;

        if(zona != null) {
            string += ", la zona en la que me ubico es "+zona.toString()+", en el "+zona.getZoo().toString();
        }

        return string;
    }
>>>>>>> c8d092c5fcfe78f8fda82edf81d0fbdafc44eb4d
}
