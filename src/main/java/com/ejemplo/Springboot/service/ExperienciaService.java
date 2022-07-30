/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Experiencia;
import com.ejemplo.Springboot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class ExperienciaService implements IExperienciaService{
 @Autowired
    public ExperienciaRepository expRepository;
    @Override
    public List<Experiencia> getExperiencia() {
        return expRepository.findAll();
    }

    @Override
    public void setExperiencia(Experiencia exp) {
        expRepository.save(exp);
    }

    @Override
    public void delExperiencia(int id) {
        expRepository.deleteById(id);
    }    
}
