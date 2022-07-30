/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Usuario;
import com.ejemplo.Springboot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anahi
 */
@Service
public class UsuarioService implements IUsuarioService {

     @Autowired
    public UsuarioRepository userRepository;
    @Override
    public List<Usuario> getUsuario() {
        return userRepository.findAll();
    }

    @Override
    public void setUsuario(Usuario user) {
        userRepository.save(user);
    }

    @Override
    public void delUsuario(int id) {
        userRepository.deleteById(id);
    }
    
}
