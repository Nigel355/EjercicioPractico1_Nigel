/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.serviceimplementation;
import com.mycompany.examen.farmacia.domain.Factura;
import com.mycompany.examen.farmacia.service.FacturaService;
import com.mycompany.examen.farmacia.dao.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository repo;

    @Override
    public List<Factura> listar() {
        return repo.findAll();
    }

    @Override
    public Factura guardar(Factura factura) {
        return repo.save(factura);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
