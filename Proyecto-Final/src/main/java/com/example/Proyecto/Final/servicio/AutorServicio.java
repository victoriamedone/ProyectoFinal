package com.example.Proyecto.Final.servicio;

import com.example.Proyecto.Final.entidades.Autor;

import java.util.List;

public interface AutorServicio {

    public List<Autor> listarTodosLosAutores();

    public Autor guardarAutor(Autor autor);

    public Autor obtenerAutorPorId (Long id);

    public Autor actualizarAutor(Autor autor);

    public void eliminarAutor(Autor autor);
}
