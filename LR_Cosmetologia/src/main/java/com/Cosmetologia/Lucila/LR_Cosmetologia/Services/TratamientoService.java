/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Services;

import com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo.Tratamiento;
import com.Cosmetologia.Lucila.LR_Cosmetologia.Repositories.TratamientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TratamientoService {
    TratamientoRepository tratamientoRepository;
    
  @Autowired
  public TratamientoService (TratamientoRepository tratamientoRepository){
  this.tratamientoRepository = tratamientoRepository;
  }
  
  public int guardarTratamiento (Tratamiento t){
  return this.tratamientoRepository.save(t).getIdTratamiento();
  }
    public List<Tratamiento> listarTratamiento() {
        return this.tratamientoRepository.findAll();
    }
}
