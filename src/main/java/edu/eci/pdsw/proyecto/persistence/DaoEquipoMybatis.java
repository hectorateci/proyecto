/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.mybatis.mappers.EquipoMapper;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author JuanHerrera
 */
public class DaoEquipoMybatis implements DaoEquipo{
    SqlSession sqlsession = null;
    EquipoMapper mapper = null;
    
    public DaoEquipoMybatis(SqlSession sqls){
        this.sqlsession = sqls;
        mapper = sqlsession.getMapper(EquipoMapper.class);
    }
    @Override
    public Equipo loadEspecific(String serial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipo loadByModel(String modelo, String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Equipo e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
