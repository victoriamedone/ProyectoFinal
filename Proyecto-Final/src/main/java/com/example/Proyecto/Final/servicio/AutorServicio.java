package com.example.Proyecto.Final.servicio;

import com.example.Proyecto.Final.entidades.Autor;

import java.util.List;

public interface AutorServicio {

    public List<Autor> listarTodosLosAutores();

    <List> Autor listarAutores();

    public Autor guardarAutor(Autor autor);

    public Autor obtenerAutorPorId (Long id);

    public Autor actualizarAutor(Autor autor);

    Autor modificarAutor(Autor autor);

    public void eliminarAutor(Autor autor);


    Autor obtenerAutorPorID(Autor Id);

    Autor obtenerAutorPorID(Integer Id);
}
