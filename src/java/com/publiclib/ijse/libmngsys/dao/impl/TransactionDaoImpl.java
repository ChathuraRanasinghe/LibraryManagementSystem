/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao.impl;

import com.publiclib.ijse.libmngsys.connetion.ResourceConnection;
import com.publiclib.ijse.libmngsys.connetion.ResourceConnectionFactory;
import com.publiclib.ijse.libmngsys.dao.TransactionDao;
import com.publiclib.ijse.libmngsys.model.TransactionModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class TransactionDaoImpl implements TransactionDao{

   

    @Override
    public int saveTransaction(TransactionModel transactionModel) throws ClassNotFoundException, SQLException {
       ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection(); 
       int res=-1;
       Statement stm=resourceConnection.getConnection().createStatement();
        try {
            res=stm.executeUpdate("INSERT into TRANSACTION VALUES ='"+transactionModel.getId()+"','"+transactionModel.getBookId()+"','"+transactionModel.getMemberId()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(TransactionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      return res;
    }

    @Override
    public List<TransactionModel> showTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editTransaction(TransactionModel transactionModel) throws ClassNotFoundException, SQLException {
       ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection(); 
       int res=-1;
       Statement stm= resourceConnection.getConnection().createStatement();
       res=stm.executeUpdate("Update Transaction SET bookid='"+transactionModel.getBookId()+"', memberid='"+transactionModel.getMemberId()+"'  WHERE id='"+transactionModel.getId()+"'");
       return res;
    }

    @Override
    public int deletrTransaction(TransactionModel transactionModel) throws ClassNotFoundException, SQLException {
        ResourceConnection resourceConnection =new ResourceConnectionFactory().getConnection();
        int res=-1;
        Statement stm=resourceConnection.getConnection().createStatement();
        res=stm.executeUpdate("DELETE From Trnsaction WHERE id='"+transactionModel.getBookId()+"'");
        return res;
    }
      
    }

   
    

  

