/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.Experiencia;
import com.ejemplo.Springboot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anahi
 */
@RestController
public class ExperienciaController {
     @Autowired
    private IExperienciaService expService;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> getExperiencia(){
        return expService.getExperiencia();
    }
    
    @PostMapping("/new/experiencia")
    public void newExperiencia(@RequestBody Experiencia exp){
        expService.setExperiencia(exp);
    }
    
    @DeleteMapping("/del/experiencia")
    public void delExperiencia(@RequestParam int id){
        expService.delExperiencia(id);
    }
}
