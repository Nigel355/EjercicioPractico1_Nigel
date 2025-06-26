/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.controller;
import com.mycompany.examen.farmacia.domain.Medicamento;
import com.mycompany.examen.farmacia.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author nigel
 */
@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("medicamentos", medicamentoService.listar());
        return "medicamentos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
    model.addAttribute("medicamento", new Medicamento());  // objeto vacío para el formulario
    
    return "agregarmedicamento/formulario"; // o la ruta correcta a tu plantilla formulario.html
}

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Medicamento medicamento) {
        medicamentoService.guardar(medicamento);
        return "redirect:/medicamentos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        medicamentoService.eliminar(id);
        return "redirect:/medicamentos";
    }
}
