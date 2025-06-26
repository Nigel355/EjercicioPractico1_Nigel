/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.examen.farmacia.service;
import com.mycompany.examen.farmacia.domain.Medicamento;
import java.util.List;
/**
 *
 * @author nigel
 */
public interface MedicamentoService {
    List<Medicamento> listar();
    Medicamento guardar(Medicamento medicamento);
    void eliminar(int id);
}
