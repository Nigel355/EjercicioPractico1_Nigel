/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.serviceimplementation;
import com.mycompany.examen.farmacia.domain.Medicamento;
import com.mycompany.examen.farmacia.service.MedicamentoService;
import com.mycompany.examen.farmacia.dao.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoRepository repo;

    @Override
    public List<Medicamento> listar() {
        return repo.findAll();
    }

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        return repo.save(medicamento);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
