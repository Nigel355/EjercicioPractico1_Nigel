/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.serviceimplementation;
import com.mycompany.examen.farmacia.domain.Categoria;
import com.mycompany.examen.farmacia.service.CategoriaService;
import com.mycompany.examen.farmacia.dao.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author nigel
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    @Override
    public List<Categoria> listar() {
        return repo.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return repo.save(categoria);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
