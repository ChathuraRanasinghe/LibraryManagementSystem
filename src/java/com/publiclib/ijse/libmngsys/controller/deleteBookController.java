/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.controller;

import com.publiclib.ijse.libmngsys.dto.BookDto;
import com.publiclib.ijse.libmngsys.services.BookServices;
import com.publiclib.ijse.libmngsys.services.ServicesFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abans
 */
@WebServlet(name = "deleteBookController", urlPatterns = {"/deleteBookController"})
public class deleteBookController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String id=request.getParameter("id");
           
           BookDto dto=new BookDto();
           dto.setId(id);
           
           BookServices bookService=new ServicesFactory().getBookServices();
           
           boolean res=false;
           
            try {
                res=bookService.deleteBook(dto);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(deleteBookController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            } catch (SQLException ex) {
                Logger.getLogger(deleteBookController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
            out.print((res)? "success":"fail");  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
