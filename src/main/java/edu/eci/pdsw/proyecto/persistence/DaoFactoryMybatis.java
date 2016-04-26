/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import javax.persistence.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 *
 * @author JuanHerrera
 */
public class DaoFactoryMybatis extends DaoFactory{
    
    private static SqlSessionFactory sqlsf;
    private static SqlSession sqls = null;
    
    public DaoFactoryMybatis(Properties properties) {
        sqlsf = null;
        try {
            InputStream inputStream;
            inputStream = Resources.getResourceAsStream(properties.getProperty("config"));
            sqlsf = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    @Override
    public void beginSession() throws PersistenceException {
        sqls = sqlsf.openSession();
    }

    @Override
    public DaoEquipoMybatis getDaoEquipo() {
        return new DaoEquipoMybatis(sqls);
    }

    @Override
    public void commitTransaction() throws PersistenceException {
        if (sqls!=null){
            sqls.commit();
        }
    }

    @Override
    public void rollbackTransaction() throws PersistenceException {
        if (sqls!=null){
            sqls.rollback();
        }
    }

    @Override
    public void endSession() throws PersistenceException {
        if(sqls!=null){
            sqls.close();
        }
    }
    
}
