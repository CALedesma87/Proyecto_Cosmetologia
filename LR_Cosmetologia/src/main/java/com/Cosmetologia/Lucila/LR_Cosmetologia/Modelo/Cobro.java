/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cobro")
public class Cobro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCobro;
    @ManyToOne
    private Cliente idCliente;
    private double monto;
    private LocalDate fechaPago;
    @Enumerated(EnumType.STRING)
    private MetodoPago metodoPago;
    @Enumerated(EnumType.STRING)
    private TipoTratamiento tipoTratamiento;

    // Nuevo atributo para la descripción
    private String descripcion;

}
