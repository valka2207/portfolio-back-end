/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.Habilidad;
import com.ejemplo.Springboot.service.IHabilidadesService;
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
public class HabilidadesController {
      @Autowired
    private IHabilidadesService habService;
    
    @GetMapping("/habilidad")
    @ResponseBody
    public List<Habilidad> getHabilidad(){
        return habService.getHabilidad();
    }
    
    @PostMapping("/new/habilidad")
    public void newHabilidad(@RequestBody Habilidad hab){
        habService.setHabilidad(hab);
    }
    
    @DeleteMapping("/del/habilidad")
    public void delHabilidad(@RequestParam int id){
        habService.delHabilidad(id);
    }
    
}
