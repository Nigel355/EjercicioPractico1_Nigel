/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.examen.farmacia.service;
import com.mycompany.examen.farmacia.domain.Categoria;
import java.util.List;
/**
 *
 * @author nigel
 */
public interface CategoriaService {
    List<Categoria> listar();
    Categoria guardar(Categoria categoria);
    void eliminar(int id);
}