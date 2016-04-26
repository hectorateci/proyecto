/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.services;

import edu.eci.pdsw.proyecto.logica.entiddes.Equipo;

/**
 *
 * @author nicolas
 */
public class ProyectoServices {
   
    /**
     * Registra un equipo en el inventario.
     * @param eq 
     */
    public void registrarEquipo(Equipo eq){
        throw new RuntimeException("No se ha implementado el metodo 'registrarEquipo'");
        
    }
    
    /**
     * Consulta si hay un modelo de equipo ya existente.
     * @param modelo
     * @return si un modelo esta o no.
     */
    public boolean consultarModelo(String modelo){
        throw new RuntimeException("No se ha implementado el metodo 'consultarEquipo'");
        //return false;
    }
    
    /**
     * Aumenta el inventario de cierto modelo en la cantidad especificada.
     * @param cant 
     * @param modelo
     */
    public void aumentarInventario(String modelo,int cant){
    
    }
}
