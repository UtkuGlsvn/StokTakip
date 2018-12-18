/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Glsvn
 */
public class DatabaseConnect {
   public Connection DatabaseConnect()
    {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:43169/cardb", "Stoktakip", "admin");
			return con;
		} catch (Exception ex) {
			System.out.println("Database not connect error:"+ ex.getMessage());
			return null;
		}
    }

	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception ex) {
                    
		}
	}
    
}
