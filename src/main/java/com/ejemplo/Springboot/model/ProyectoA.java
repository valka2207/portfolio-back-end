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
public class ProyectoA {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String url;
    private String titulo;
    private String descripcion;

    public ProyectoA() {
    }

    public ProyectoA(int id, String url, String titulo, String descripcion) {
        this.id = id;
        this.url = url;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    
}
