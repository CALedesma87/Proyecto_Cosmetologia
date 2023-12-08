/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Services;

import com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo.Cobro;
import com.Cosmetologia.Lucila.LR_Cosmetologia.Repositories.CobroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CobroService {

    CobroRepository cobroRepository;

    @Autowired
    public CobroService(CobroRepository cobroRepository) {
        this.cobroRepository = cobroRepository;
    }

    public int guardarCobro(Cobro c) {
        return cobroRepository.save(c).getIdCobro();
    }

    public List<Cobro> listarGasto() {
        return this.cobroRepository.findAll();
    }
}
