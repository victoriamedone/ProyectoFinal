package com.example.Proyecto.Final.repositorio;

import com.example.Proyecto.Final.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Integer> {

    List<Libro> FindById(Libro id);
}
