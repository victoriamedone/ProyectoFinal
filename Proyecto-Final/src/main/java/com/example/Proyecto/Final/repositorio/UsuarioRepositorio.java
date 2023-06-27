package com.example.Proyecto.Final.repositorio;

import com.example.Proyecto.Final.entidades.Autor;
import com.example.Proyecto.Final.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository {

    public Usuario findByEmail(String email);
}
