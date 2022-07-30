/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.controller;

import com.ejemplo.Springboot.model.Usuario;
import com.ejemplo.Springboot.service.IUsuarioService;
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
public class UsuarioController {
     @Autowired
    private IUsuarioService userService;
    
    @GetMapping("/usuario")
    @ResponseBody
    public List<Usuario> getUsuario(){
        return userService.getUsuario();
    }
    
    @PostMapping("/new/usuario")
    public void newUsuario(@RequestBody Usuario user){
        userService.setUsuario(user);
    }
    
    @DeleteMapping("/del/usuario")
    public void delUsuario(@RequestParam int id){
        userService.delUsuario(id);
    }
}
