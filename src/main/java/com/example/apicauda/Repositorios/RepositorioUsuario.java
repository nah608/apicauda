/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apicauda.Repositorios;

import com.example.apicauda.Entidacdes.Usuarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository <Usuarios, Long>{
    Optional<Usuarios> findByUsuario(String usuario);
}
