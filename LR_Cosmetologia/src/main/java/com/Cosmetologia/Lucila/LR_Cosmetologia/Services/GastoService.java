/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Services;

import com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo.Gasto;
import com.Cosmetologia.Lucila.LR_Cosmetologia.Repositories.GastoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService {

    GastoRepository gastoRepository;

    @Autowired

    public GastoService(GastoRepository gastoRepository) {
        this.gastoRepository = gastoRepository;

    }

    public int guardar(Gasto g) {
        return this.gastoRepository.save(g).getIdGasto();

    }
    
     public List<Gasto> listarGasto() {
        return this.gastoRepository.findAll();
    }

}
