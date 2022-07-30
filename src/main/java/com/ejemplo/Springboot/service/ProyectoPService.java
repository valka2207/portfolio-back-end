/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.ProyectoP;
import com.ejemplo.Springboot.repository.ProyectoPRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class ProyectoPService implements IProyectoPService{
 @Autowired
    public ProyectoPRepository progRepository;
    @Override
    public List<ProyectoP> getProyectoP() {
        return progRepository.findAll();
    }

    @Override
    public void setProyectoP(ProyectoP prog) {
        progRepository.save(prog);
    }

    @Override
    public void delProyectoP(int id) {
        progRepository.deleteById(id);
    }
    
}
