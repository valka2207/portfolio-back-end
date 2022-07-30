/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.ProyectoA;
import java.util.List;

/**
 *
 * @author anahi
 */
public interface IProyectoAService {
    public List<ProyectoA>getProyectoA();
    public void setProyectoA(ProyectoA proya);
    public void delProyectoA(int id);
}
