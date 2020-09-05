/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.controller;

import com.publiclib.ijse.libmngsys.dto.TransactionDto;
import com.publiclib.ijse.libmngsys.services.ServicesFactory;
import com.publiclib.ijse.libmngsys.services.TransactionServices;
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
@WebServlet(name = "updateTransactionController", urlPatterns = {"/updateTransactionController"})
public class updateTransactionController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                       
           String id=request.getParameter("id");
           String isbn=request.getParameter("isbn");
           String name=request.getParameter("name");
           
           TransactionDto dto=new TransactionDto();
           dto.setId(id);
           dto.setBookId(id);
           dto.setMemberId(name);
          
           
           
             TransactionServices Service=new ServicesFactory().getTransactionServices();
           boolean res=false;
           
           
            try {
                res=Service.editTransaction(dto);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(updateTransactionController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            } catch (SQLException ex) {
                Logger.getLogger(updateTransactionController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
          
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
