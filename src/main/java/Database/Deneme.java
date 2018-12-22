package Database;

import java.sql.Connection;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnect a = new DatabaseConnect();
		LoginDAO login = new LoginDAO();
		System.out.println("sada");
		login.Control("admin", "admin",a);


}
}


