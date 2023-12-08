/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo;

import java.util.HashMap;
import java.util.Map;
import lombok.*;

@Getter
public enum MetodoPago {
    EFECTIVO("Efectivo"),
    TARJETA("Tarjeta"),
    TRANSFERENCIA("Transferencia");

    private final String nombre;

    private static final Map<String, MetodoPago> stringToEnum = new HashMap<>();

    static {
        for (MetodoPago metodo : values()) {
            stringToEnum.put(metodo.nombre, metodo);
        }
    }

    MetodoPago(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static MetodoPago fromString(String nombre) {
        MetodoPago metodoPago = stringToEnum.get(nombre);
        if (metodoPago == null) {
            throw new IllegalArgumentException("Método de pago no válido: " + nombre);
        }
        return metodoPago;
    }
}
