/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao;

import com.publiclib.ijse.libmngsys.dao.impl.BookDaoImpl;
import com.publiclib.ijse.libmngsys.dao.impl.MemberDaoImpl;
import com.publiclib.ijse.libmngsys.dao.impl.TransactionDaoImpl;


/**
 *
 * @author Abans
 */
public class DaoFactory {
    
    public BookDao getBookDao(){
        return new BookDaoImpl();
    }
    public MemberDao getMemberDao(){
         return new MemberDaoImpl();
    }
    
    public TransactionDao getTransactionDao(){
        return new TransactionDaoImpl();
   
   }

    
    
}
