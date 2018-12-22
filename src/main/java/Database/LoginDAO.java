/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Glsvn
 */
public class LoginDAO {
 
    public boolean Control(String user, String password,DatabaseConnect con) {
    	
		PreparedStatement ps;
		Connection conn = con.DatabaseConnect();
		try {
			ps = conn.prepareStatement("Select username,password from admin.KULLANICI  where username = ? and password = ? ");
			ps.setString(1, user);
			ps.setString(2, password);
			System.out.println(ps.toString());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("oh yes");
				System.out.println(rs.getString("username"));
				return true;
			}
			else
			{
				System.out.println("sex");
			}
			 rs.close();
		       ps.close();
		       conn.close();
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.out.println("Error:" + ex.toString());
			
			} 
		return false;

	}
}
