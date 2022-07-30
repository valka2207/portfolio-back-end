/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.ProyectoA;
import com.ejemplo.Springboot.service.IProyectoAService;
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
public class ProyectoAController {
     @Autowired
    private IProyectoAService artService;
    
    @GetMapping("/artistico")
    @ResponseBody
    public List<ProyectoA> getProyectoA(){
        return artService.getProyectoA();
    }
    
    @PostMapping("/new/artistico")
    public void newProyectoA(@RequestBody ProyectoA art){
        artService.setProyectoA(art);
    }
    
    @DeleteMapping("/del/artistico")
    public void delProyectoA(@RequestParam int id){
        artService.delProyectoA(id);
    }
}
