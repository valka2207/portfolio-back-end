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
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String urlFoto;
    private String urlBanner;
    private String fechaNacimiento;

    public Usuario() {
    }

    public Usuario(int id, String usuario, String password, String nombre, String apellido, String descripcion, String urlFoto, String urlBanner, String fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
