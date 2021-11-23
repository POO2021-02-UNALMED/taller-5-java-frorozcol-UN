package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitad, genero);
        this.colorPiel = colorPiel;

        Anfibio.listado.add(this);
    }
    public Anfibio(){
        Anfibio.listado.add(this);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamndra = new Anfibio(nombre, edad, "selva", genero, "negro", false);
        salamandras++;
        return salamndra;
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }
}