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
import javax.persistence.PersistenceException;

/**
 *
 * @author nicolas
 */

public class ProyectoServicesMybatis extends ProyectoServices{
   DaoFactory daoFac;
    
    private final Properties properties=new Properties();
    public ProyectoServicesMybatis () throws IOException{
        InputStream input = null;
        input = ProyectoServices.class.getClassLoader().getResource("applicationconfig.properties").openStream();       
        Properties properties=new Properties();
        properties.load(input);
         daoFac =DaoFactory.getInstance(properties);
    }
    
    @Override
    
    public void registrarEquipo(Equipo eq)throws ExceptionProyectoServices{
       
        daoFac .beginSession();        
        daoFac.getDaoEquipo().save(eq);
        daoFac.commitTransaction();
        daoFac.endSession();               
    }
   
    @Override
    public boolean consultarModelo(String modelo){
   
        
        daoFac.beginSession();
        daoFac.getDaoEquipo().loadEspecific(modelo);
        daoFac.commitTransaction();
        daoFac.endSession();
        return false;
    }
    
   
    
    @Override
    public void aumentarInventario(String modelo,int cant){
        
        daoFac.beginSession();
        daoFac.getDaoEquipo();
        daoFac.commitTransaction();
        daoFac.endSession();
    }

   
}
