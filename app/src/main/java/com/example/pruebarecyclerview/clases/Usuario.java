package com.example.pruebarecyclerview.clases;

public class Usuario {

    private String portada;
    private String nombre;
    private String cantantes;

    public Usuario(String portada, String nombre, String cantantes) {
        this.portada = portada;
        this.nombre = nombre;
        this.cantantes = cantantes;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantantes() {
        return cantantes;
    }

    public void setCantantes(String cantantes) {
        this.cantantes = cantantes;
    }
}
