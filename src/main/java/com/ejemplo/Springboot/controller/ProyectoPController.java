/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.ProyectoP;
import com.ejemplo.Springboot.service.IProyectoPService;
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
public class ProyectoPController {
     @Autowired
    private IProyectoPService progService;
    
    @GetMapping("/programacion")
    @ResponseBody
    public List<ProyectoP> getProyectoP(){
        return progService.getProyectoP();
    }
    
    @PostMapping("/new/programacion")
    public void newProyectoP(@RequestBody ProyectoP prog){
        progService.setProyectoP(prog);
    }
    
    @DeleteMapping("/del/programacion")
    public void delProyectoP(@RequestParam int id){
        progService.delProyectoP(id);
    }
    
}
