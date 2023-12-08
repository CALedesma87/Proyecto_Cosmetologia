/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cosmetologia.Lucila.LR_Cosmetologia.Services;

import com.Cosmetologia.Lucila.LR_Cosmetologia.Modelo.Cliente;
import com.Cosmetologia.Lucila.LR_Cosmetologia.Repositories.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    ClienteRepository clienteRepository;

    @Autowired

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public int guardar(Cliente t) {
        return this.clienteRepository.save(t).getIdCliente();
    }

    public Cliente obtenerClientePorId(Integer id) {
        return this.clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> listarClientes() {
        return this.clienteRepository.findAll();
    }

    public void actualizarCliente(Integer id, String nuevoNombre, String nuevoApellido,
            String nuevoTelefono, Integer nuevoEdad, String nuevoEmail, String nuevoSexo) {
        
        Cliente cliente = this.clienteRepository.findById(id).orElse(null);

        if (cliente != null) {
            // Actualiza los datos del cliente
            cliente.setNombre(nuevoNombre);
            cliente.setApellido(nuevoApellido);
            cliente.setTelefono(nuevoTelefono);
            cliente.setEdad(nuevoEdad);
            cliente.setEmail(nuevoEmail);
            cliente.setSexo(nuevoSexo);

            // Guarda el cliente actualizado en la base de datos
            this.clienteRepository.save(cliente);
        }
    }
    
    public Cliente obtenerClientePorDNI(long dni) {
        return this.clienteRepository.findByDni(dni);
    }
}
