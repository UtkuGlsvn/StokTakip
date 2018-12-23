/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Glsvn
 */
public class AuthorizationDAO {
	
    public boolean authorizationControl(DatabaseConnect con) {
    	
		PreparedStatement ps;
		Connection conn = con.DatabaseConnect();
		try {
			ps = conn.prepareStatement("select yetki from yetki");
			System.out.println(ps.toString());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("logindao succesful");
				return true;
			}
			else
			{
				System.out.println("logindao fail");
			}
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.out.println("Error:" + ex.toString());
			
			} 
		return false;

	}
    
}
