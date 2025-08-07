/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Servicios;

import com.example.apicauda.Entidacdes.Bebedero;
import com.example.apicauda.Repositorios.RepositorioBebedero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioBebedero {
    @Autowired
    RepositorioBebedero rBebederos;
    
    public List<Bebedero> obtenerTodosLosBebederos() {
        return rBebederos.findAll();
    }

    
    public boolean actualizarBebedero(Bebedero a) {
        try {
            rBebederos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarBebedero(Integer id) {
        try {
            rBebederos.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarBebedero(Bebedero a) {
        try {
            rBebederos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
