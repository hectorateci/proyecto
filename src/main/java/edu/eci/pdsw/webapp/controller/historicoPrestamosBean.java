/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import edu.eci.pdsw.proyecto.logica.entidades.prestamo;
import edu.eci.pdsw.proyecto.services.ProyectoServices;
import java.io.IOException;
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
    ProyectoServices ps;
    public historicoPrestamosBean() throws IOException{
        ps= ProyectoServices.getInstance();
        this.listaDeEquipos = ps.listaEquipos();
    }
    
    /*
    *Devuelve el equipo seleccionado en la vista
    *@return Equipo seleccionado
    */
    
    private Equipo getEquipoSeleccionado(){
        return equipoSeleccionado;
    }
    /*
    *Modifica el equipo que ha sido seleccionado
    *@Param Equipo seleccionado en la vista
    */
    private void setEquipoSeleccionado(Equipo equipo){
        this.equipoSeleccionado = equipo;
    }
    /*
    *Devuelve la lista de equipos que hay en el laboratorio
    *@return Lista de equipos 
    */
    public List<Equipo> getListaDeEquipos(){
        return listaDeEquipos;
    }
    /*
    *Depende del equipo seleccionado por el laboratista, devuelve una lista con
    *el historial de prestamos del equipo.
    *@Return Lista de prestamos del equipo seleccionado
    */
    public List<prestamo> getHistorialPorEquipo(){ 
        for (int i =0;i<=equipoSeleccionado.getEquipoPrestamo().size();i++){
            listaDePrestamos.add( equipoSeleccionado.getEquipoPrestamo().get(i));
        }
        return listaDePrestamos;
       //return listaDePrestamos;
    }
    /*
    *Modifica el historial de prestamos del equipo seleccionado.
    *@Param Lista de prestamos modificada
    */
    public void setHistorialPorEquipo(ArrayList<prestamo> a){ 
       this.listaDePrestamos = a;
       //return listaDePrestamos;
    }
    
    
}
