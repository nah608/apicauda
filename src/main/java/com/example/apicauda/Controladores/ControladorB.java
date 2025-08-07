/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Controladores;

import com.example.apicauda.Entidacdes.Bebedero;
import com.example.apicauda.Servicios.ServicioBebedero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bebedero")
public class ControladorB {
    @Autowired
    ServicioBebedero sBebederos;
    
    @GetMapping("/todos")
    public List<Bebedero> obtenerTodos() {
        return sBebederos.obtenerTodosLosBebederos();
    }
    
    @PostMapping
    public List<Bebedero> guardar(@RequestBody Bebedero a1) {
        sBebederos.insertarBebedero(a1);
        return sBebederos.obtenerTodosLosBebederos();
    }
    
    @PutMapping
    public List<Bebedero> actualizar(@RequestBody Bebedero a1) {
        sBebederos.actualizarBebedero(a1);
        return sBebederos.obtenerTodosLosBebederos();
    }
    
    @DeleteMapping("/{id}")
    public List<Bebedero> eliminar(@PathVariable Integer id) {
        sBebederos.eliminarBebedero(id);
        return sBebederos.obtenerTodosLosBebederos();
    }
}
