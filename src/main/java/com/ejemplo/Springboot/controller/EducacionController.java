/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.Educacion;
import com.ejemplo.Springboot.service.IEducacionService;
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
public class EducacionController {
     @Autowired
    private IEducacionService eduService;
    
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion> getEducacion(){
        return eduService.getEducacion();
    }
    
    @PostMapping("/new/educacion")
    public void newEducacion(@RequestBody Educacion exp){
        eduService.setEducacion(exp);
    }
    
    @DeleteMapping("/del/educacion")
    public void delEducacion(@RequestParam int id){
        eduService.delEducacion(id);
    }
}
