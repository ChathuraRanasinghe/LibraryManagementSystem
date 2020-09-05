/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao;

import com.publiclib.ijse.libmngsys.model.TransactionModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface TransactionDao {
     public int saveTransaction(TransactionModel transactionModel) throws ClassNotFoundException, SQLException  ;
    public List<TransactionModel>showTransaction()throws ClassNotFoundException,SQLException;
    public int editTransaction(TransactionModel transactionModel)throws ClassNotFoundException,SQLException;

    public int deletrTransaction(TransactionModel transactionModel)throws ClassNotFoundException,SQLException;
    
    
}
