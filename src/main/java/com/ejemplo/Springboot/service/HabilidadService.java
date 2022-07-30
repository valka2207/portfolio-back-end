/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Habilidad;
import com.ejemplo.Springboot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class HabilidadService implements IHabilidadesService {
 @Autowired
    public HabilidadesRepository habRepository;
    @Override
    public List<Habilidad> getHabilidad() {
        return habRepository.findAll();
    }

    @Override
    public void setHabilidad(Habilidad hab) {
        habRepository.save(hab);
    }

    @Override
    public void delHabilidad(int id) {
        habRepository.deleteById(id);
    }
}
