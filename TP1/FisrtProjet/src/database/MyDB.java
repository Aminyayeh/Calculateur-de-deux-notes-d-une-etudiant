package database;


import java.sql.Connection;
import java.sql.DriverManager;

public class MyDB{

	private String link;
	private String user;
	private String mdp;
	
	
	// Constructeurs
		public MyDB(String link, String user, String mdp) {
			this.link = link;
			this.user = user;
			this.mdp = mdp;
		}
		
	
	// GETTERS - SETTERS
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	
	
	// static commun pour charger le driver jdbc
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("LOADED");
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		// connection dans PhpMyAdmin
	
	public Connection getConnection() {
		// get connection impl
		Connection connection = null;
		try {
			// Pour la connexion à la base de donnée
			connection = DriverManager.getConnection(this.link, this.user, this.mdp);
			System.out.println("Connexion a la base de donnée réussi!");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return connection;
		
		
			
	}
}
