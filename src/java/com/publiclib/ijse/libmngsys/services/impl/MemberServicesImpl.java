/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services.impl;

import com.publiclib.ijse.libmngsys.dao.DaoFactory;
import com.publiclib.ijse.libmngsys.dao.MemberDao;
import com.publiclib.ijse.libmngsys.dto.MemberDto;
import com.publiclib.ijse.libmngsys.model.MemberModel;
import com.publiclib.ijse.libmngsys.services.MemberServices;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abans
 */
public class MemberServicesImpl implements MemberServices{

    @Override
    public boolean saveMember(MemberDto memberDto)throws ClassNotFoundException,SQLException{
        MemberDao memberDao=new DaoFactory().getMemberDao();
       MemberModel memberModel=new MemberModel();
        memberModel.setId(memberDto.getId());
        memberModel.setName(memberDto.getName());
        memberModel.setMobile(memberModel.getMobile());
        
        boolean res=false;
        
        try {
            res=(0<memberDao.insertMember(memberModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
      return res;
    }

    @Override
    public List<MemberDto> showBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editMember(MemberDto memberDto) throws ClassNotFoundException, SQLException {
      MemberDao memberDao=new DaoFactory().getMemberDao();
      MemberModel memberModel=new MemberModel();
      memberModel.setId(memberDto.getId());
      memberModel.setName(memberDto.getId());
      memberModel.setMobile(memberDto.getId());
      
      boolean res=false;
      
        try {
            res=(0<memberDao.updateMember(memberModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
            
        }
        return res;
    }

    @Override
     public boolean deleteMember(MemberDto memberDto) throws ClassNotFoundException, SQLException {
        MemberDao memberDao=new DaoFactory().getMemberDao();
        MemberModel memberModel=new MemberModel();
         memberModel.setId(memberDto.getId());
     
        boolean res=false;
     
        try {
            res=(0<memberDao.deleteMember(memberModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(MemberServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
            return res;
    }
    
}
