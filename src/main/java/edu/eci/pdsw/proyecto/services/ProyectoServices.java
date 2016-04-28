/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.services;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import java.io.IOException;

/**
 *
 * @author JuanHerrera
 */
public abstract class ProyectoServices {
    private static ProyectoServices instance;
    protected ProyectoServices (){
        
    }
    
    public static ProyectoServices getInstance() throws IOException{
        instance= new ProyectoServicesMybatis();
        return instance;
    }
    
    /**
     * Registra un equipo en el inventario.
     * @param eq 
     */
    
    public abstract void registrarEquipo(Equipo eq) throws ExceptionProyectoServices;
        
    
    
    /**
     * Consulta si hay un modelo de equipo ya existente.
     * @param modelo
     * @return si un modelo esta o no.
     */
    public abstract boolean consultarModelo (String Modelo);
    
    
     /**
     * Aumenta el inventario de cierto modelo en la cantidad especificada.
     * @param cant 
     * @param modelo
     */
    public abstract void aumentarInventario(String Modelo,int cant);
    
    
}


