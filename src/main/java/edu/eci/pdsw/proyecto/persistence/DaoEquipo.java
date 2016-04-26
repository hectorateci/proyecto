/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;

/**
 *
 * @author JuanHerrera
 */
public interface DaoEquipo {
    
    public Equipo loadEspecific(String serial);
    public Equipo loadByModel(String modelo, String placa);
    public void save(Equipo e);
    
}
