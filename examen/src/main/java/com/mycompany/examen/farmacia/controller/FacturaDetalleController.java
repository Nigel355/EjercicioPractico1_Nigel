/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.controller;
import com.mycompany.examen.farmacia.domain.FacturaDetalle;
import com.mycompany.examen.farmacia.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author nigel
 */
@Controller
@RequestMapping("/facturadetalle")
public class FacturaDetalleController {

    @Autowired
    private FacturaDetalleService facturaDetalleService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("detalles", facturaDetalleService.listar());
        return "facturadetalle/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("detalle", new FacturaDetalle());
        return "facturadetalle/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute FacturaDetalle detalle) {
        facturaDetalleService.guardar(detalle);
        return "redirect:/facturadetalle";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        facturaDetalleService.eliminar(id);
        return "redirect:/facturadetalle";
    }
}
