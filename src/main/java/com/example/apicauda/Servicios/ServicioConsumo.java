/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Servicios;

import com.example.apicauda.Entidacdes.Consumos;
import com.example.apicauda.Repositorios.RepositorioConsumo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioConsumo {
    @Autowired
    RepositorioConsumo rConsumos;
    
    public List<Consumos> obtenerTodosLosConsumos() {
        return rConsumos.findAll();
    }
    
   public Optional<Consumos> obtenerConsumo(Long id) {
        return rConsumos.findById(id);
    }
    
    public List<Consumos> obtenerConsumosPorBebedero(Long idbebedero) {
        return rConsumos.findByIdbebedero(idbebedero);
    }
    
    public boolean eliminarConsumo(Long id) {
        try {
            rConsumos.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Consumos actualizarConsumo(Long id, Consumos datosActualizados) {
        Optional<Consumos> consumoOpt = rConsumos.findById(id);
        if (consumoOpt.isPresent()) {
            Consumos consumo = consumoOpt.get();

            consumo.setIdbebedero(datosActualizados.getIdbebedero());
            consumo.setFechaHora(datosActualizados.getFechaHora());
            consumo.setCantidadConsumida(datosActualizados.getCantidadConsumida());

            return rConsumos.save(consumo);
        }
        return null; // O lanza una excepción personalizada si prefieres
    }
    
    public boolean insertarConsumo(Consumos a) {
        try {
            rConsumos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
