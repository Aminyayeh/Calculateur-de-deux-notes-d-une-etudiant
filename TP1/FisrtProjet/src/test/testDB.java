package test;

import database.MyDB;
import junit.framework.TestCase;

public class testDB extends TestCase{
	
	public void testConnection() { // Vrai
		String link = "jdbc:mysql://localhost:3306/djib";
		String user = "root";
		String mdp = "";
		MyDB db = new MyDB(link, user, mdp);
		
		assertNotNull(db.getConnection());
	}
	
	public void testConnection2() { // Faux
		String link = "jdbc:mysql://localhost:3306/djib";
		String user = "ali";
		String mdp = "";
		MyDB db = new MyDB(link, user, mdp);
		
		assertNull(db.getConnection());
	}
	
}
