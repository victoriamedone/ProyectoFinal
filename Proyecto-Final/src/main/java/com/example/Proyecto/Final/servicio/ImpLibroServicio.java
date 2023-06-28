package com.example.Proyecto.Final.servicio;


import com.example.Proyecto.Final.entidades.Libro;
import com.example.Proyecto.Final.repositorio.LibroRepositorio;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpLibroServicio implements LibroServicio {

    @Autowired
    LibroRepositorio libroRepositorio;


    @Override
    public List<Libro> listarTodosLosLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    @Override
    public Libro obtenerLibroPorId(Long id){
        return libroRepositorio.findById(id).get(id.intValue());
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepositorio.delete(libro);
    }
}
