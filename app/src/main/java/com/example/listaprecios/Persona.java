package com.example.listaprecios;

public class Persona {
    private String Usuario;
    private String Contraseña;
    private String Nombre;
    private String Apellido;
    private String Genero;

    public Persona() {
    }

    public Persona(String usuario, String contraseña, String nombre, String apellido, String genero) {
        Usuario = usuario;
        Contraseña = contraseña;
        Nombre = nombre;
        Apellido = apellido;
        Genero = genero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
