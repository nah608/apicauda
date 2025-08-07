/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apicauda.Repositorios;

import com.example.apicauda.Entidacdes.Consumos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioConsumo extends JpaRepository<Consumos, Long> {
    List<Consumos> findByIdbebedero(Long idbebedero);
}
