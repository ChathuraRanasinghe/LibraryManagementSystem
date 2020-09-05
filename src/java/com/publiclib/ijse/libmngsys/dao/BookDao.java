/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao;

import com.publiclib.ijse.libmngsys.model.BookModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface BookDao {
    public int insertBook(BookModel bookModel)throws ClassNotFoundException,SQLException;
    public ArrayList<BookModel> readAll()throws ClassNotFoundException,SQLException;
    public int updateBook(BookModel bookModel)throws ClassNotFoundException,SQLException;
    public int deleteBook(BookModel bookModel)throws ClassNotFoundException,SQLException;
    
    
}
