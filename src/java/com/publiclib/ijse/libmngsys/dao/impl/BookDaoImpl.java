/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao.impl;

import com.publiclib.ijse.libmngsys.connetion.ResourceConnection;
import com.publiclib.ijse.libmngsys.connetion.ResourceConnectionFactory;
import com.publiclib.ijse.libmngsys.dao.BookDao;
import com.publiclib.ijse.libmngsys.model.BookModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class BookDaoImpl implements BookDao {

    @Override
    public int insertBook(BookModel bookModel) throws SQLException, ClassNotFoundException {
       ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection(); 
       int res=-1;
       Statement stm;
        try {
            stm = resourceConnection.getConnection().createStatement();
              res=stm.executeUpdate("INSERT INTO Book VALUES('"+bookModel.getId()+"','"+bookModel.getIsbn()+"','"+bookModel.getName()+"')");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
     return res;
       
    }

  

    @Override
    public int updateBook(BookModel bookModel) throws ClassNotFoundException, SQLException {
        ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res=stm.executeUpdate("UPDATE Book SET name='"+bookModel.getName()+"',isbn='"+bookModel.getIsbn()+"' WHERE id='"+bookModel.getId()+"'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public int deleteBook(BookModel bookModel) throws ClassNotFoundException, SQLException {
        ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res=stm.executeUpdate("DELETE FROM Book WHERE id='"+bookModel.getId()+"'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        }
        return res;
    }

    @Override
    public ArrayList<BookModel> readAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
