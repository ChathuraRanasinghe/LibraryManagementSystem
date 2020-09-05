/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services;

import com.publiclib.ijse.libmngsys.services.impl.BookServicesImpl;
import com.publiclib.ijse.libmngsys.services.impl.MemberServicesImpl;
import com.publiclib.ijse.libmngsys.services.impl.TransactionServicesImpl;


/**
 *
 * @author Abans
 */
public class ServicesFactory {
    
    public BookServices getBookServices(){
        return new BookServicesImpl();
    }
    
    public MemberServices getMemberServices(){
            return new MemberServicesImpl();
    }
    
    public TransactionServices getTransactionServices(){
            return new TransactionServicesImpl();
    }
}
