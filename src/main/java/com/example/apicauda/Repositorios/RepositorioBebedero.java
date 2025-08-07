/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apicauda.Repositorios;

import com.example.apicauda.Entidacdes.Bebedero;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nahum
 */
public interface RepositorioBebedero extends JpaRepository <Bebedero, Integer>{
    
}
