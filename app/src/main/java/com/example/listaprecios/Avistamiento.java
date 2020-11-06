package com.example.listaprecios;

import java.io.Serializable;

public class Avistamiento implements Serializable, Comparable<Avistamiento> {
    private String Nombre;
    private String Latitud;
    private String Longitud;

    public Avistamiento() {
    }

    public Avistamiento(String nombre, String latitud, String longitud) {
        Nombre = nombre;
        Latitud = latitud;
        Longitud = longitud;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public int compareTo(Avistamiento o)
    {
        return getLatitud().compareTo(o.getLatitud());
    }
}
