/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class MysqlConnectionImpl implements ResourceConnection{

    @Override
    public Connection getConnection()throws ClassNotFoundException,SQLException{
        Connection conn=null;
        
        try {
            Class.forName("com.jdbc.mysql.Driver");
                                      
             conn=DriverManager.getConnection("jdbc:Mysql://localhost:3306/Libraryv","root","Mysql@1234");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MysqlConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
            return conn;
        }
      
    }
    


