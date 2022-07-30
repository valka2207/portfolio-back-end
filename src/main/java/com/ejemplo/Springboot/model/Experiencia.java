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
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String url;
    private String empresa;
    private String puesto;
    private String fechadeinicio;
    private String fechadeegreso;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(int id, String url, String empresa, String puesto, String fechadeinicio, String fechadeegreso, String descripcion) {
        this.id = id;
        this.url = url;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechadeinicio = fechadeinicio;
        this.fechadeegreso = fechadeegreso;
        this.descripcion = descripcion;
    }
    
}
