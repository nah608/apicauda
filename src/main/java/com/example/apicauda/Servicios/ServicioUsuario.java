/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Servicios;

import com.example.apicauda.Entidacdes.Usuarios;
import com.example.apicauda.Repositorios.RepositorioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Usuarios> listarUsuarios() {
        return repositorioUsuario.findAll();
    }

    public Optional<Usuarios> obtenerUsuarioPorId(Long id) {
        return repositorioUsuario.findById(id);
    }

    public Usuarios guardarUsuario(Usuarios usuario) {
        // Encripta la contraseña antes de guardar
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return repositorioUsuario.save(usuario);
    }

    public Usuarios actualizarUsuario(Long id, Usuarios datosActualizados) {
        Optional<Usuarios> usuarioOpt = repositorioUsuario.findById(id);
        if (usuarioOpt.isPresent()) {
            Usuarios usuario = usuarioOpt.get();
            usuario.setNombre(datosActualizados.getNombre());
            usuario.setUsuario(datosActualizados.getUsuario());
            usuario.setRol(datosActualizados.getRol());

            if (datosActualizados.getPassword() != null && !datosActualizados.getPassword().isEmpty()) {
                usuario.setPassword(passwordEncoder.encode(datosActualizados.getPassword()));
            }

            return repositorioUsuario.save(usuario);
        }
        return null;
    }

    public void eliminarUsuario(Long id) {
        repositorioUsuario.deleteById(id);
    }

    public boolean login(String usuario, String passwordPlano) {
        Optional<Usuarios> usuarioOpt = repositorioUsuario.findByUsuario(usuario);
        if (usuarioOpt.isPresent()) {
            Usuarios user = usuarioOpt.get();
            return passwordEncoder.matches(passwordPlano, user.getPassword());
        }
        return false;
    }

    public Optional<Usuarios> obtenerPorUsuario(String usuario) {
        return repositorioUsuario.findByUsuario(usuario);
    }
}
