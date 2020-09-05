/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.services;

import com.publiclib.ijse.libmngsys.dto.MemberDto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface MemberServices {
    public boolean saveMember(MemberDto memberDto)throws ClassNotFoundException,SQLException;
   public List<MemberDto>showBook()throws ClassNotFoundException,SQLException;
   public boolean editMember(MemberDto memberDto)throws ClassNotFoundException,SQLException;
   public boolean deleteMember(MemberDto memberDto)throws ClassNotFoundException,SQLException;
    
}
