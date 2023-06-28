package com.example.Proyecto.Final.servicio;

import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.entidades.Libro;
import com.example.Proyecto.Final.repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface LibroServicio {

    public  List<Libro> listarTodosLosLibros();

    public Libro guardarLibro(Libro libro);

    public Libro obtenerLibroPorId(Long id);

    public Libro actualizarLibro(Libro libro);

    public void eliminarLibro(Libro libro);

}
