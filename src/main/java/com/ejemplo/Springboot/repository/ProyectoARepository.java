/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.ProyectoA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anahi
 */
@Repository
public interface ProyectoARepository extends JpaRepository<ProyectoA, Integer> {
    
}
