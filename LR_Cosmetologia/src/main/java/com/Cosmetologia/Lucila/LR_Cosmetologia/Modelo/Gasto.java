/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "gasto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Gasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGasto;
    private String descripcion;
    private double monto;
    private LocalDate fechaGasto;
}
