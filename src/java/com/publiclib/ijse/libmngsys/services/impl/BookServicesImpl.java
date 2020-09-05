/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services.impl;

import com.publiclib.ijse.libmngsys.dao.BookDao;
import com.publiclib.ijse.libmngsys.dao.DaoFactory;

import com.publiclib.ijse.libmngsys.dto.BookDto;
import com.publiclib.ijse.libmngsys.model.BookModel;
import com.publiclib.ijse.libmngsys.services.BookServices;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class BookServicesImpl implements BookServices{

    @Override
    public boolean saveBook(BookDto bookDto) {
       BookDao bookDao=new DaoFactory().getBookDao();
       BookModel bookModel=new BookModel();
       bookModel.setId(bookDto.getId());
       bookModel.setIsbn(bookDto.getIsbn());
       bookModel.setName(bookDto.getName());
       
       boolean res=false;
        try {
            res=(0<bookDao.insertBook(bookModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
       return res;
    }

    @Override
    public List<BookDto> showBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editBook(BookDto bookDto)throws ClassNotFoundException,SQLException{
       BookDao bookDao=new DaoFactory().getBookDao();
       
       BookModel bookModel=new BookModel();
       bookModel.setId(bookDto.getId());
       bookModel.setIsbn(bookDto.getIsbn());
       bookModel.setName(bookDto.getName());
       
       boolean res=false;
       
        try {
            res=(0<bookDao.updateBook(bookModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        } catch (SQLException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public boolean deleteBook(BookDto bookDto) throws ClassNotFoundException, SQLException {
       BookDao bookDao=new DaoFactory().getBookDao();
       
       BookModel bookModel=new BookModel();
       bookModel.setId(bookDto.getId());
       
       boolean res=false;
       
        try {
            res=(0<bookDao.deleteBook(bookModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(BookServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
       return res;
    }
    
}
