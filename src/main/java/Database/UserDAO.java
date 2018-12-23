/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.userBean;

/**
 *
 * @author Glsvn
 */
public class UserDAO {
	
    public ArrayList getUserlist(DatabaseConnect con) {
    	
		PreparedStatement ps;
	    Statement stmtObj;
		Connection conn = con.DatabaseConnect();
        ResultSet resultSetObj;
        
		ArrayList userlist = new ArrayList();
		try {
	        stmtObj = conn.createStatement();    
            resultSetObj = stmtObj.executeQuery("Select * from admin.KULLANICI");
            
            while(resultSetObj.next()) {  
            	userBean userbean = new userBean();
            	userbean.setId(resultSetObj.getInt("K_ID"));  
            	userbean.setAd(resultSetObj.getString("AD"));  
            	userbean.setSoyad(resultSetObj.getString("SOYAD"));  
            	userbean.setUsername(resultSetObj.getString("USERNAME"));  
            	userbean.setPassword(resultSetObj.getString("PASSWORD"));  
            	userbean.setYetki_id(resultSetObj.getInt("K_ID"));  
            	userlist.add(userbean);  
			} 
            System.out.println("Veriler eklendi: " + userlist.size());
            stmtObj.close();
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.out.println("Error:" + ex.toString());
			
			} 
		return userlist;

	}

}
