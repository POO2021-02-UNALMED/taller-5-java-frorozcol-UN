package gestion;

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
        Zona zona = new Zona();
        this.zonas.add(zona);
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


}
