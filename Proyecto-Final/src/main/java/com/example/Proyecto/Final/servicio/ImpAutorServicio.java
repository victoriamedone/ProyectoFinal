package com.example.Proyecto.Final.servicio;
import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public abstract class ImpAutorServicio implements AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    @Override
    public <List> Autor listarAutores() {
        return (Autor) autorRepositorio.findAll();
    }

    @Override
    public Autor guardarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    @Override
    public Autor modificarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    @Override
    public void eliminarAutor(Autor autor) {
        autorRepositorio.delete(autor);
    }

    @Override
    public Autor obtenerAutorPorID(Integer Id) {
        return autorRepositorio.findById(Id).get();
    }
}
