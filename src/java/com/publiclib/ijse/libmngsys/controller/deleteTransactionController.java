/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.controller;

import com.publiclib.ijse.libmngsys.dto.MemberDto;
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
@WebServlet(name = "deleteTransactionController", urlPatterns = {"/deleteTransactionController"})
public class deleteTransactionController extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
         String id=request.getParameter("id");
         TransactionDto dto=new TransactionDto();
         dto.setId(id);
         
            TransactionServices transactionServices=new ServicesFactory().getTransactionServices();
            boolean res=false;
            
            try {
                res=transactionServices.deletrTransaction(dto);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(deleteTransactionController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            } catch (SQLException ex) {
                Logger.getLogger(deleteTransactionController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
                    out.print((res? "success":"fail"));
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
