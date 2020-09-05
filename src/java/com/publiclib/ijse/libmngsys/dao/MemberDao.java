/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.publiclib.ijse.libmngsys.dao;

import com.publiclib.ijse.libmngsys.model.MemberModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abans
 */
public interface MemberDao {
    public int insertMember(MemberModel memberModel)throws ClassNotFoundException,SQLException;
    public ArrayList<MemberModel> readAll()throws ClassNotFoundException,SQLException;
    public int updateMember(MemberModel memberModel)throws ClassNotFoundException,SQLException;
    public int deleteMember(MemberModel memberModel)throws ClassNotFoundException,SQLException;
}
