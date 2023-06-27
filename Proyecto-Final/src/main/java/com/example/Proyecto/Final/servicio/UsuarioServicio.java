package com.example.Proyecto.Final.servicio;

import com.example.Proyecto.Final.DTO.UsuarioRegistroDTO;
import com.example.Proyecto.Final.entidades.Usuario;

import java.util.List;

public interface UsuarioServicio<U, L extends Number> {

    public List<Usuario> listarUsuarios();

    List<Usuario> listarUsuarios(Usuario usuario);

    public Usuario guardarUsuario(Usuario usuario);

    Usuario crearUsuario(UsuarioRegistroDTO usuario);

    public Usuario editarUsuario(Usuario usuario);

    public Usuario obtenerUsuarioPorId (Long id);

    public void eliminarUsuario(Usuario usuario);
}



