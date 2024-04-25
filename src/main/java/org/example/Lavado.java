package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lavado {
    private int id;
    private LocalDateTime fecha;
    private String tipoDeLavado;
    private String estadoDeLavado;
    private Persona persona;
    private double precio;

    public Lavado(String tipoDeLavado, Persona persona) {
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.estadoDeLavado = "pendiente";
        this.persona = persona;
        switch (tipoDeLavado.toLowerCase()) {
            case "lavado básico":
                this.precio = 5000;
                break;
            case "lavado full":
                this.precio = 15000;
                break;
            case "lavado interior":
                this.precio = 10000;
                break;
            default:
                this.precio = 0;
                break;
        }
    }

    public void marcarComoCompletada() {
        this.estadoDeLavado = "completada";
    }
    public void mostrarDetalles(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        System.out.println("ID de Orden: " + this.id);
        System.out.println("Fecha y Hora: " + this.fecha.format(formatter));
        System.out.println("Tipo de Lavado: " + this.tipoDeLavado);
        System.out.println("Precio: " + this.precio);
        System.out.println("Estado: " + this.estadoDeLavado);
        System.out.println("Cliente: " + this.persona.getNombre());
        System.out.println("Patente: " + this.persona.getPatente());
        System.out.println("Modelo: " + this.persona.getModelo());
    }
}

