package amin;
/**
 * 
 * @author Amin Yayeh
 *
 */
public class Matiere {
	
	public int id ;
	public String nom ;
	public String coefficient ;
	
	
	
	public Matiere(int id, String nom, String coefficient) {
		super();
		this.id = id;
		this.nom = nom;
		this.coefficient = coefficient;
	}

	public Matiere() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
	}
	
	

	

}
