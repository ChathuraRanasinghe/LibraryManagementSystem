/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services;

import com.publiclib.ijse.libmngsys.dto.TransactionDto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface TransactionServices {
    public boolean saveTransaction(TransactionDto transactionDto)throws ClassNotFoundException,SQLException;
    public List<TransactionDto>showTransaction()throws ClassNotFoundException,SQLException;
    public boolean editTransaction(TransactionDto transactionDto)throws ClassNotFoundException,SQLException;
    public boolean deletrTransaction(TransactionDto transactionDto)throws ClassNotFoundException,SQLException;
    
}
