package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Habilidad;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author anahi
 */
public interface IHabilidadesService {
    public List<Habilidad>getHabilidad();
    public void setHabilidad(Habilidad hab);
    public void delHabilidad(int id);
}
