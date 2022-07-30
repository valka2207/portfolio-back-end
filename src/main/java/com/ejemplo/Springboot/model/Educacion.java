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
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String institucion;
    private String fechadeinicio;
    private String fechadeegreso;
    private String titulo;
    private int porcentaje;

    public Educacion() {
    }

    public Educacion(int id, String institucion, String fechadeinicio, String fechadeegreso, String titulo, int porcentaje) {
        this.id = id;
        this.institucion = institucion;
        this.fechadeinicio = fechadeinicio;
        this.fechadeegreso = fechadeegreso;
        this.titulo = titulo;
        this.porcentaje = porcentaje;
    }
    
}
