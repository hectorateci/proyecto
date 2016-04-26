/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.bean;

import edu.eci.pdsw.proyecto.logica.entidades.prestamo;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author 2098654
 */
@ManagedBean(name="InventarioBean")
@SessionScoped

public class inventario {
    
    private String nombre;
    private String marca;
    private Boolean estado;
    private String descripcion;
    private Date fechaAdquisicion ;
    private Date fechaGarantia ;
    private int valor  ;
    private String ordenCompra;
    private String codigoActivo;
    private Boolean asegurado ;
    private String categoria;
    private int tiempoUso;
    private String proveedor;
    private String descripcionEstado;
    private List<prestamo> prestamoEquipo = new LinkedList<prestamo>();
    
    
}
