/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Experiencia;
import java.util.List;

/**
 *
 * @author anahi
 */
public interface IExperienciaService {
    public List<Experiencia>getExperiencia();
    public void setExperiencia(Experiencia exp);
    public void delExperiencia(int id);
}
