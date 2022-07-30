/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author anahi
 */
@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private String descripcion;
    private int porcentaje;

    public Habilidad() {
    }

    public Habilidad(int id, String titulo, String descripcion, int porcentaje) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }
    
}
