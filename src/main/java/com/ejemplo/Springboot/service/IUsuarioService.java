/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Usuario;
import java.util.List;

/**
 *
 * @author anahi
 */
public interface IUsuarioService {
    public List<Usuario>getUsuario();
    public void setUsuario(Usuario user);
    public void delUsuario(int id);
}
