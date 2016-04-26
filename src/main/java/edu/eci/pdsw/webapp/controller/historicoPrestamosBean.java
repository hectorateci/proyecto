/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entiddes.Equipo;
import edu.eci.pdsw.proyecto.logica.entiddes.Usuario;
import edu.eci.pdsw.proyecto.logica.entiddes.prestamo;
import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private List<Equipo> listaDeEquipos = new ArrayList<Equipo>();
    private List<prestamo> listaDePrestamos = new ArrayList<prestamo>();
    private ArrayList<String> ejemplo = new ArrayList<>();
    
    private Equipo getEquipoSeleccionado(){
        return equipoSeleccionado;
    }
    public List<Equipo> getListaDeEquipos(){
        return listaDeEquipos;
    }
    public List<prestamo> getHistorialPorEquipo(){ 
        for (int i =0;i<=equipoSeleccionado.getEquipoPrestamo().size();i++){
            listaDePrestamos.add( equipoSeleccionado.getEquipoPrestamo().get(i));
        }
        return listaDePrestamos;
       //return listaDePrestamos;
    }
    
    public void setHistorialPorEquipo(ArrayList<prestamo> a){ 
       this.listaDePrestamos = a;
       //return listaDePrestamos;
    }
    
    
}
