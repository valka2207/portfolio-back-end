/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.ProyectoP;
import java.util.List;

/**
 *
 * @author anahi
 */
public interface IProyectoPService {
    public List<ProyectoP>getProyectoP();
    public void setProyectoP(ProyectoP proyp);
    public void delProyectoP(int id);
}
