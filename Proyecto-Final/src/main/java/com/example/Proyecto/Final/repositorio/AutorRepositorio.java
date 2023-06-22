package com.example.Proyecto.Final.repositorio;

import com.example.Proyecto.Final.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Integer> {
    List<Autor> findById(Autor id);
}
