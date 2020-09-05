/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao.impl;

import com.publiclib.ijse.libmngsys.connetion.ResourceConnection;
import com.publiclib.ijse.libmngsys.connetion.ResourceConnectionFactory;
import com.publiclib.ijse.libmngsys.dao.MemberDao;
import com.publiclib.ijse.libmngsys.model.MemberModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public int insertMember(MemberModel memberModel) throws ClassNotFoundException, SQLException {
         ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection(); 
       int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res=stm.executeUpdate("INSERT INTO Member VALUES('"+memberModel.getId()+"','"+memberModel.getName()+"','"+memberModel.getName()+"')");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        } catch (SQLException ex) {
            Logger.getLogger(MemberDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }
    

    @Override
    public ArrayList<MemberModel> readAll() throws SQLException, ClassNotFoundException {
        ArrayList<MemberModel>readAll=new ArrayList<MemberModel>();
        ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection(); 
       int res=-1;
       Statement stm=resourceConnection.getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select * from Member");
        
        while(rst.next()){
            MemberModel temp=new MemberModel();
            temp.setId(rst.getString("id"));
             temp.setName(rst.getString("name"));
              temp.setMobile(rst.getString("mobile"));
              
              readAll.add(temp);
        }
        return readAll;
       
    }

    @Override
    public int updateMember(MemberModel memberModel) throws ClassNotFoundException, SQLException {
       ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res=stm.executeUpdate("UPDATE Member SET name='"+memberModel.getName()+"',mobile='"+memberModel.getMobile()+"' WHERE id='"+memberModel.getId()+"'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public int deleteMember(MemberModel memberModel) throws ClassNotFoundException, SQLException {
       ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res=stm.executeUpdate("DELETE FROM Member WHERE id='"+memberModel.getId()+"'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(BookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        }
        return res;
    }
    
}
