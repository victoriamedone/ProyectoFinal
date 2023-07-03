package com.example.Proyecto.Final.controlador;
import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.entidades.Libro;
import com.example.Proyecto.Final.servicio.AutorServicio;
import com.example.Proyecto.Final.servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    @Autowired
    private AutorServicio autorServicio;
    @GetMapping("/Libros")
    public String listarLibros(Model modelo){
        modelo.addAttribute("Libro ", libroServicio.listarTodosLosLibros());
        return "libros";
    }

    @GetMapping("/libros/nuevo")
    public String crearLibroFormulario(Model modelo) {
        Libro libro = new Libro();
        List<Autor> listaAutores = autorServicio.listarTodosLosAutores();

        modelo.addAttribute("libro", libro);
        modelo.addAttribute("autores", listaAutores);

        return "crear_libro";
    }






}
