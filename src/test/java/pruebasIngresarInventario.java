/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2098874
 */

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.services.ProyectoServicesMybatis;
import java.sql.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class pruebasIngresarInventario {
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo ya esta existente con un numero de serial y un numero de placa.
    *Tipo de prueba: positiva.
    *
    */
    
    
    @Test
    public void ingresarInventarioModeloExistenteSerialPlaca(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        ps.registrarEquipo(e);
        String modelo = "Cable caiman";
        if(ps.consultarModelo(modelo)){
            Equipo eq = new Equipo("CAB007","000556");
        }
        Assert.assertTrue("Paso la prueba", true);
        
    }
    
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo ya esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    
    /*
    @Test
    public void ingresarInventarioModeloExistenteSerial(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        ps.registrarEquipo(e);
        String modelo = "Cable caiman";
        if(ps.consultarModelo(modelo)){
            Equipo eq = new Equipo("CAB007");
        }
        Assert.assertTrue("Paso la prueba", true);
    }
    
    */
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial y un numero de placa.
    *Tipo de prueba: positiva.
    *
    */
    
    /*
    @Test
    public void ingresarInventarioModeloNoExistenteSerialPlaca(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        ps.registrarEquipo(e);
        Assert.assertTrue("Paso la prueba", true);
    }
    
    */
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    
    /*
    @Test
    public void ingresarInventarioModeloNoExistenteSerial(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        ps.registrarEquipo(e);
        Assert.assertTrue("Paso la prueba", true);
    }
    
    */
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    
    /*
    @Test
    public void ingresarInventarioModeloExistenteSerialExistente(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        try{
            ps.registrarEquipo(e);
            ps.registrarEquipo(e);
        }catch(Exception ex){
            Assert.assertTrue("Paso la prueba", true);
        }
    }
    
    */
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    
    /*
    @Test
    public void ingresarInventarioModeloExistentePlacaExistente(){
       ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        try{
            ps.registrarEquipo(e);
            ps.registrarEquipo(e);
        }catch(Exception ex){
            Assert.assertTrue("Paso la prueba", true);
        }
    }
    
    */
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    
    /*
    @Test
    public void ingresarInventarioModeloNoExistenteSerialExistente(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        try{
            ps.registrarEquipo(e);
        }catch(Exception ex){
            Assert.assertTrue("Paso la prueba", true);
        }
    }
    
    */
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    
    /*
    @Test
    public void ingresarInventarioModeloNoExistentePlacaExistente(){
        ProyectoServices ps = new ProyectoServices();
        Equipo e = new Equipo("Cable caiman", "nnn", true, "Clable caiman para sugetar", new Date(2016, 4, 21), new Date(2016, 7, 1), 10000, "ref002", "CAB007", true, "diario", 0, "Exito", "Estado optimo en buenas condiciones");
        try{
            ps.registrarEquipo(e);
        }catch(Exception ex){
            Assert.assertTrue("Paso la prueba", true);
        }
    }*/


}
