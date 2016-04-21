/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2098874
 */

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
        
    }
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo ya esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloExistenteSerial(){
        
    }
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial y un numero de placa.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloNoExistenteSerialPlaca(){
        
    }
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloNoExistenteSerial(){
        
    }
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloExistenteSerialExistente(){
    
    }
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloExistentePlacaExistente(){
    
    }
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloNoExistenteSerialExistente(){
    
    }
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloNoExistentePlacaExistente(){
    
    }
}
