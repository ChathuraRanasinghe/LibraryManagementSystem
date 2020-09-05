/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services;

import com.publiclib.ijse.libmngsys.dto.BookDto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface BookServices {
    public boolean saveBook(BookDto bookDto)throws ClassNotFoundException,SQLException;
    public List<BookDto>showBook()throws ClassNotFoundException,SQLException;
    public boolean editBook(BookDto bookDto)throws ClassNotFoundException,SQLException;
    public boolean deleteBook(BookDto bookDto)throws ClassNotFoundException,SQLException;
    
}
