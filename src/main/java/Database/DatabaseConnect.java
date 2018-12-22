/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Glsvn
 */
public class DatabaseConnect {
	String url="jdbc:oracle:thin:admin@//localhost:49161/xe";
	String username="admin";
	String password="admin";
   public Connection DatabaseConnect()
    {
        try {
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return con;
		} catch (Exception ex) {
			System.out.println("Database not connect error:"+ ex.getMessage());
			return null;
		}
    }

	public static void close(Connection con) {
		try {
			System.out.println("Closed");
			con.close();
		} catch (Exception ex) {
			System.out.println("Database close error:"+ ex.getMessage());
                    
		}
	}

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}