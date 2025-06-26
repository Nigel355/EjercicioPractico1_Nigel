/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.serviceimplementation;
import com.mycompany.examen.farmacia.domain.FacturaDetalle;
import com.mycompany.examen.farmacia.service.FacturaDetalleService;
import com.mycompany.examen.farmacia.dao.FacturaDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {

    @Autowired
    private FacturaDetalleRepository repo;

    @Override
    public List<FacturaDetalle> listar() {
        return repo.findAll();
    }

    @Override
    public FacturaDetalle guardar(FacturaDetalle detalle) {
        return repo.save(detalle);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
