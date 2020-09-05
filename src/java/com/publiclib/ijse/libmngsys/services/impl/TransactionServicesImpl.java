
package com.publiclib.ijse.libmngsys.services.impl;

import com.publiclib.ijse.libmngsys.dao.DaoFactory;
import com.publiclib.ijse.libmngsys.dao.TransactionDao;
import com.publiclib.ijse.libmngsys.dto.TransactionDto;
import com.publiclib.ijse.libmngsys.model.TransactionModel;
import com.publiclib.ijse.libmngsys.services.TransactionServices;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class TransactionServicesImpl implements TransactionServices {

    @Override
    public boolean saveTransaction(TransactionDto transactionDto) throws ClassNotFoundException, SQLException {
       TransactionDao transactionDao=new DaoFactory().getTransactionDao();
       TransactionModel model=new TransactionModel();
       model.getId();
       model.getBookId();
       model.getMemberId();
       
       boolean res=false;
        try {
            res=(0<transactionDao.saveTransaction(model));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public List<TransactionDto> showTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editTransaction(TransactionDto transactionDto) throws SQLException, ClassNotFoundException {
         TransactionDao transactionDao=new DaoFactory().getTransactionDao();
       TransactionModel model=new TransactionModel();
       model.getId();
       model.getBookId();
       model.getMemberId();
       
       boolean res=false;
       
        try {
            res=(0<transactionDao.editTransaction(model));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
       
       return res;
        
    }

    @Override
    public boolean deletrTransaction(TransactionDto transactionDto) throws ClassNotFoundException, SQLException {
         TransactionDao transactionDao=new DaoFactory().getTransactionDao();
       TransactionModel model=new TransactionModel();
       model.getId();
       
       boolean res=false;
       
        try {
            res=(0<transactionDao.deletrTransaction(model));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(TransactionServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
       return res;
    }
    
}
