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
import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Tartamiento")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamiento;
    @ManyToOne
    private Cliente idCliente;
    @Enumerated(EnumType.STRING)
    private TipoTratamiento idtipoTratamiento;
    private String descripcion;
    private LocalDate fehaRealizada;
}
