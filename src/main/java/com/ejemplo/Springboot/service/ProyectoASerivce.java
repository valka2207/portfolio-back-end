/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.ProyectoA;
import com.ejemplo.Springboot.repository.ProyectoARepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class ProyectoASerivce implements IProyectoAService {
 @Autowired
    public ProyectoARepository artRepository;
    @Override
    public List<ProyectoA> getProyectoA() {
        return artRepository.findAll();
    }

    @Override
    public void setProyectoA(ProyectoA art) {
        artRepository.save(art);
    }

    @Override
    public void delProyectoA(int id) {
        artRepository.deleteById(id);
    }
}
