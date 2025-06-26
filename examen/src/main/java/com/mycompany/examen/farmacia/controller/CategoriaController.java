/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.farmacia.controller;
import com.mycompany.examen.farmacia.domain.Categoria;
import com.mycompany.examen.farmacia.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author nigel
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @GetMapping("/")
    public String index() {
        return "index"; 
    }
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("categorias", categoriaService.listar());
        return "categoria/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categoria";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        categoriaService.eliminar(id);
        return "redirect:/categoria";
    }
}
