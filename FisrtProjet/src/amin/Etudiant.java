package amin;

/*
 * first
 * 
 * */

public class Etudiant {
	
	public int Id ;
	public String Nom ;
	public String Prenom ;
	public String Adresse ;
	public String Email ;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public Etudiant(int id, String nom, String prenom, String adresse, String email) {
		super();
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Email = email;
	}
	
	public Etudiant () {
		
	}


}