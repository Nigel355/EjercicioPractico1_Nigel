/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.serviceimplementation;
import com.mycompany.examen.farmacia.domain.Cliente;
import com.mycompany.examen.farmacia.service.ClienteService;
import com.mycompany.examen.farmacia.dao.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
