/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.services;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.persistence.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author nicolas
 */

public class ProyectoServices {
    
    private static ProyectoServices instance=null;
    
    private final Properties properties=new Properties();
    
    private ProyectoServices () throws IOException{
        InputStream input = null;
        input = servicesP.class.getClassLoader().getResource("applicationconfig.properties").openStream();       
        Properties properties=new Properties();
        properties.load(input);
    }
   
    
    public static ProyectoServices getInstance(String propertiesNombre ) throws RuntimeException, IOException{
        
        return instance;
    }
    /**
     * Registra un equipo en el inventario.
     * @param eq 
     */
    public void registrarEquipo(Equipo eq){
       
        DaoFactory daoFac =DaoFactory.getInstance(properties);
        daoFac.beginSession();
        daoFac.getDaoEquipo().save(eq);
        daoFac.commitTransaction();
        daoFac.endSession();
        
                
    }
    
    
    
    /**
     * Consulta si hay un modelo de equipo ya existente.
     * @param modelo
     * @return si un modelo esta o no.
     */
    public boolean consultarModelo(String modelo){
   
        DaoFactory daoFac=DaoFactory.getInstance(properties);
        daoFac.beginSession();
        daoFac.getDaoEquipo().loadEspecific(modelo);
        daoFac.commitTransaction();
        daoFac.endSession();
        return false;
    }
    
    /**
     * Aumenta el inventario de cierto modelo en la cantidad especificada.
     * @param cant 
     * @param modelo
     */
    public void aumentarInventario(String modelo,int cant){
    DaoFactory daoFac=DaoFactory.getInstance(properties);
    daoFac.beginSession();
    daoFac.getDaoEquipo();
    daoFac.commitTransaction();
    daoFac.endSession();
    }
}
