/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.controller;
import com.mycompany.examen.farmacia.domain.Factura;
import com.mycompany.examen.farmacia.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author nigel
 */
@Controller
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("facturas", facturaService.listar());
        return "facturas/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("factura", new Factura());
        return "facturas/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Factura factura) {
        facturaService.guardar(factura);
        return "redirect:/facturas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        facturaService.eliminar(id);
        return "redirect:/facturas";
    }
}