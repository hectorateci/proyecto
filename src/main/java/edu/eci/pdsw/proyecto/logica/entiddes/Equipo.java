/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entiddes;

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
    private String proveedor;
    private String descripcion_estado;
    
    /**
     * 
     * @param nombre
     * @param marca
     * @param estado
     * @param descripcion
     * @param fecha_adquisicion
     * @param fecha_garantia
     * @param valor
     * @param orden_compra
     * @param codigo_activo
     * @param asegurado
     * @param categoria
     * @param tiempo_uso
     * @param proveedor
     * @param descripcion_estado 
     */
    public  Equipo (String nombre,String marca,Boolean estado,String descripcion,Date fecha_adquisicion , Date fecha_garantia ,int valor  ,String orden_compra,String codigo_activo,Boolean asegurado ,String categoria,int tiempo_uso,String proveedor,String descripcion_estado){
        this .nombre=nombre;
        this.marca=marca;
        this.estado=estado;
        this.descripcion=descripcion;
        this.fecha_adquisicion=fecha_adquisicion;
        this.fecha_garantia=fecha_garantia;
        this.valor=valor;
        this.orden_compra=orden_compra;
        this.codigo_activo=codigo_activo;
        this.asegurado=asegurado;
        this.categoria=categoria;
        this.tiempo_uso=tiempo_uso;
        this.proveedor=proveedor;
        this.descripcion_estado=descripcion_estado;
                
    }
    
    /**
     * 
     * @param serial
     * @param placa 
     */
    public Equipo(String serial, String placa){
        throw new RuntimeException("No se ha implementado el metodo constructor 'Equipo'");
            
    }
    /**
     * 
     * @param serial 
     */
    public Equipo(String serial){
        throw new RuntimeException("No se ha implementado el metodo constructor 'Equipo'");
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public Date getFecha_garantia() {
        return fecha_garantia;
    }

    public void setFecha_garantia(Date fecha_garantia) {
        this.fecha_garantia = fecha_garantia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getOrden_compra() {
        return orden_compra;
    }

    public void setOrden_compra(String orden_compra) {
        this.orden_compra = orden_compra;
    }

    public String getCodigo_activo() {
        return codigo_activo;
    }

    public void setCodigo_activo(String codigo_activo) {
        this.codigo_activo = codigo_activo;
    }

    public Boolean getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Boolean asegurado) {
        this.asegurado = asegurado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTiempo_uso() {
        return tiempo_uso;
    }

    public void setTiempo_uso(int tiempo_uso) {
        this.tiempo_uso = tiempo_uso;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion_estado() {
        return descripcion_estado;
    }

    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcion_estado = descripcion_estado;
    }

}
 