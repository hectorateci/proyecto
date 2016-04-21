/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
    
}
