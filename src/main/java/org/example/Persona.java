package org.example;
public class Persona {
    private String nombre;
    private String patente;
    private String modelo;


    public Persona(String nombre, String patente, String modelo){
        this.nombre = nombre;
        this.patente = patente;
        this.modelo = modelo;

    }
    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

}
