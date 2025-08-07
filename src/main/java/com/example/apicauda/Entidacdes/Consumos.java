/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apicauda.Entidacdes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "consumo")
public class Consumos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idconsumo;
    private Long idbebedero;
    private String fechaHora;
    private BigDecimal cantidadConsumida;

    public Long getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(Long idconsumo) {
        this.idconsumo = idconsumo;
    }

    public Long getIdbebedero() {
        return idbebedero;
    }

    public void setIdbebedero(Long idbebedero) {
        this.idbebedero = idbebedero;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public BigDecimal getCantidadConsumida() {
        return cantidadConsumida;
    }

    public void setCantidadConsumida(BigDecimal cantidadConsumida) {
        this.cantidadConsumida = cantidadConsumida;
    }

    
}
