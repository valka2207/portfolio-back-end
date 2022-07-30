/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Educacion;
import com.ejemplo.Springboot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class EducacionService implements IEducacionService{
 @Autowired
    public EducacionRepository eduRepository;
    @Override
    public List<Educacion> getEducacion() {
        return eduRepository.findAll();
    }

    @Override
    public void setEducacion(Educacion edu) {
        eduRepository.save(edu);
    }

    @Override
    public void delEducacion(int id) {
        eduRepository.deleteById(id);
    }    
}
