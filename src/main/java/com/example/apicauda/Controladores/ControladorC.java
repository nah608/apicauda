/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Controladores;

import com.example.apicauda.Entidacdes.Consumos;
import com.example.apicauda.Servicios.ServicioConsumo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumo")
public class ControladorC {
    @Autowired
    ServicioConsumo sConsumos;
    
    @GetMapping("/todos")
    public List<Consumos> obtenerTodos() {
        return sConsumos.obtenerTodosLosConsumos();
    }
    
    @GetMapping("/bebedero/{bebedero_id}")
    public List<Consumos> obtenerConsumosPorBebedero(@PathVariable Long bebedero_id) {
        return sConsumos.obtenerConsumosPorBebedero(bebedero_id);
    }
    
    @GetMapping("/{id}")
    public Consumos obtenerConsumo(@PathVariable Long id) {
        return sConsumos.obtenerConsumo(id).orElse(null);
    }
    
    @PostMapping
    public List<Consumos> guardar(@RequestBody Consumos a1) {
        sConsumos.insertarConsumo(a1);
        return sConsumos.obtenerTodosLosConsumos(); 
    }
    
    @PutMapping("/{id}")
    public Consumos actualizarConsumo(@PathVariable Long id, @RequestBody Consumos consumo) {
        return sConsumos.actualizarConsumo(id, consumo);
    }
    
    @DeleteMapping("/{id}")
    public List<Consumos> eliminar(@PathVariable Long id) {
        sConsumos.eliminarConsumo(id);
        return sConsumos.obtenerTodosLosConsumos();
    }
}
