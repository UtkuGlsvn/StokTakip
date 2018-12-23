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

import Bean.urunBean;

/**
 *
 * @author Glsvn
 */
public class ProductDAO {
	
public ArrayList geProductlist(DatabaseConnect con) {
    	
		PreparedStatement ps;
	    Statement stmtObj;
		Connection conn = con.DatabaseConnect();
        ResultSet resultSetObj;
        
		ArrayList productList = new ArrayList();
		try {
	        stmtObj = conn.createStatement();    
            resultSetObj = stmtObj.executeQuery("Select * from admin.urun");
            
            while(resultSetObj.next()) {  
            	urunBean urunbean = new urunBean();
            	urunbean.setId(resultSetObj.getInt("ID"));  
            	urunbean.setUrun_ad(resultSetObj.getString("U_AD"));  
            	urunbean.setBarkod_no(resultSetObj.getString("BARKOD_NO"));  
            	urunbean.setU_tarihi(resultSetObj.getString("U_TARIHI"));  
            	urunbean.setS_tarihi(resultSetObj.getString("S_TARIHI"));
            	urunbean.setFiyat(resultSetObj.getString("FIYAT"));
            	urunbean.setDepo_id(resultSetObj.getInt("DEPO_ID"));  
            	productList.add(urunbean);  
			} 
            System.out.println("Veriler eklendi: " + productList.size());
            stmtObj.close();
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.out.println("Error:" + ex.toString());
			
			} 
		return productList;

	}

}
