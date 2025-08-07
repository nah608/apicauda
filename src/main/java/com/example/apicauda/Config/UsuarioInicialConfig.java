/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Config;

import com.example.apicauda.Entidacdes.Usuarios;
import com.example.apicauda.Repositorios.RepositorioUsuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UsuarioInicialConfig {

    @Bean
    CommandLineRunner crearUsuarioAdmin(RepositorioUsuario repositorio, PasswordEncoder encoder) {
        return args -> {
            String usuarioLogin = "admin";
            String nombre = "Administrador";
            String passwordPlano = "cosustenta2025*";
            String rol = "ADMIN";

            if (repositorio.findByUsuario(usuarioLogin).isEmpty()) {
                Usuarios admin = new Usuarios();
                admin.setNombre(nombre);
                admin.setUsuario(usuarioLogin);
                admin.setPassword(encoder.encode(passwordPlano));
                admin.setRol(rol);

                repositorio.save(admin);
                System.out.println("✅ Usuario administrador creado.");
            } else {
                System.out.println("ℹ️  Usuario administrador ya existe.");
            }
        };
    }
}