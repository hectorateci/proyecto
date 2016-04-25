/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entiddes.Equipo;
import edu.eci.pdsw.proyecto.logica.entiddes.prestamo;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jairogonzalez
 */
@SessionScoped
@ManagedBean(name="HistoricoPrestamosBean")
public class historicoPrestamosBean implements Serializable {
    private Equipo equipoSeleccionado;
    private prestamo prestamoDeEquipo;
    private List<Equipo> listaDeEquipos;
    private List<prestamo> listaDePrestamos ;
    private Equipo getEquipoSeleccionado(){
        return equipoSeleccionado;
    }
    public List<Equipo> getListaDeEquipos(){
        return listaDeEquipos;
    }
    public List<prestamo> historialPorEquipo(){ 
       
       
       return listaDePrestamos;
    }
    
}
