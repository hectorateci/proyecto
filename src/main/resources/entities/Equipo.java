/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author 2098654
 */
public class Equipo {
    private String nombre;
    private String marca;
    private Boolean estado;
    private String descripcion;
    private Date fecha_adquisicion ;
    private Date fecha_garantia ;
    private int valor  ;
    private String orden_compra;
    private String codigo_activo;
    private Boolean asegurado ;
    private String categoria;
    private int tiempo_uso;
    private proveedor proveedor;
    private String descripcion_estado;
}
