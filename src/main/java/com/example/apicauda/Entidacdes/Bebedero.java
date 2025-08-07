/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Entidacdes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebedero")
public class Bebedero {
    @Id
    @Column(unique = true, nullable = false)
    private Long idbebedero;
    private String ubicacion;
    @Column(columnDefinition = "VARCHAR(50) DEFAULT 'activo'")
    private String estado;
    private double latitud;
    private double longitud;

    public Long getIdbebedero() {
        return idbebedero;
    }

    public void setIdbebedero(Long idbebedero) {
        this.idbebedero = idbebedero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
}
