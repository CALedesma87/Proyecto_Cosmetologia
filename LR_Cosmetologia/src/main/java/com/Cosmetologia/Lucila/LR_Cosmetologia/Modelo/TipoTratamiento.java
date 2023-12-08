/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo;
import lombok.Getter;

@Getter
public enum TipoTratamiento {
    PELUQUERIA(1, "Peluquería"),
    MANICURIA(2, "Manicuría"),
    COSMETOLOGIA(3, "Cosmetología"),
    DEPILACION(4, "Depilación");

    private final int id;
    private final String nombre;

    private TipoTratamiento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public static TipoTratamiento valueOf(int id) {
    for (TipoTratamiento tipo : values()) {
        if (tipo.getId() == id) {
            return tipo;
        }
    }
    throw new IllegalArgumentException("Tipo de tratamiento no válido: " + id);
}
}
