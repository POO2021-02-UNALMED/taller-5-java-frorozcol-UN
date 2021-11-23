package zooAnimales;

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
}
