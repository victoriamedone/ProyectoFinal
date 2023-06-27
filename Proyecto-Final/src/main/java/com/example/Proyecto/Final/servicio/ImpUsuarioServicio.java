package com.example.Proyecto.Final.servicio;
import com.example.Proyecto.Final.DTO.UsuarioRegistroDTO;
import com.example.Proyecto.Final.entidades.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ImpUsuarioServicio implements UsuarioServicio<Usuario, Long>{


    @Override
    public List<Usuario> listarUsuarios(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario crearUsuario(UsuarioRegistroDTO usuario) {
        return null;
    }

    @Override
    public Usuario editarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return null;
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {

    }
}