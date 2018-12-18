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
   static DatabaseConnect con=null;
    public static boolean Control(String user, String password) {
		PreparedStatement ps = null;
		try {
			con = new DatabaseConnect();
			ps = con.prepareStatement("Select k_ad, sifre from Kullanici where k_ad = ? and sifre = ?");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Error:" + ex.getMessage());
			return false;
		} finally {
			con.close((Connection) con);
                        return false;
		}
		
	}
}
