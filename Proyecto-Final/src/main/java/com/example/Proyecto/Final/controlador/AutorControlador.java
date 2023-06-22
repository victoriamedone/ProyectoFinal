package com.example.Proyecto.Final.controlador;

import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.servicio.AutorServicio;
import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.servicio.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping("/autores")
    public String listarAutores(Model modelo){
        modelo.addAttribute("autores", autorServicio.listarAutores());
        return "autores";
    }

    @GetMapping("/autores/nuevo")
    public String crearAutorFormulario(Model modelo){
        Autor autor = new Autor();
        modelo.addAttribute("autor", autor);
        return "crear_autor";
    }

    @PostMapping("/autores")
    public String guardarAutor(@ModelAttribute("autor") Autor autor, RedirectAttributes redirect){
        autorServicio.guardarAutor(autor);

        redirect.addFlashAttribute("msgExito", "El autor ha" +
                " sido agregado con exito");

        return "redirect:/autores";
    }

    @GetMapping("/autores/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("autor", autorServicio.obtenerAutorPorId(id));
        return "editar_autor";
    }

    @PostMapping("/autores/{id}")
    public String actualizarAutor(@PathVariable Long id, @ModelAttribute("autor") Autor autor, Model modelo){
        Autor autorExistente = autorServicio.obtenerAutorPorId(id);
        autorExistente.setId(id);
        autorExistente.setNombre(autor.getNombre());
        autorExistente.setApellido(autor.getApellido());
        autorExistente.setLugarNacimiento(autor.getLugarNacimiento());
        autorExistente.setFechaNacimiento(autor.getFechaNacimiento());

        autorServicio.actualizarAutor(autorExistente);
        return "redirect:/autores";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarAutor(@PathVariable Long id, RedirectAttributes redirect) {

        Autor autor = autorServicio.obtenerAutorPorId(id);

        autorServicio.eliminarAutor(autor);


        redirect.addFlashAttribute("msgExito", "El autor ha " +
                "sido eliminado correctamente");


        return "redirect:/autores";
    }
}
