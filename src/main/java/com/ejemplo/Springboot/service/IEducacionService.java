/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Educacion;
import java.util.List;

/**
 *
 * @author anahi
 */
public interface IEducacionService {
    public List<Educacion>getEducacion();
    public void setEducacion(Educacion edu);
    public void delEducacion(int id);
}
