/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author 2098654
 */
public class prestamo {
    private Date fechaSolicitud ;
    private Date fechaDevolucion ;
    private Usuario Usuario ;
    Set<Equipo> items;
    private String detalle;
    
    public prestamo(     Date fechaSolicitud ,Date fechaDevolucion,Usuario Usuario ,Set<Equipo> items,
     String detalle ) {
        this.Usuario=Usuario;
        this.detalle=detalle;
        this.fechaDevolucion=fechaDevolucion;
        this.fechaSolicitud=fechaSolicitud;
  
    
    }
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Set<Equipo> getItems() {
        return items;
    }

    public void setItems(Set<Equipo> items) {
        this.items = items;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    
}
