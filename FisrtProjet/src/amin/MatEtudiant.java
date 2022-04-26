package amin;
/**
 * 
 * @author Amin Yayeh
 *
 */
public class MatEtudiant {
	public Matiere a ;
	public Etudiant b ;
	
	
	
	public MatEtudiant(Matiere a, Etudiant b) {
		this.a = a;
		this.b = b;
	}
	
	public MatEtudiant() {
		
	}
	
	public Matiere getA() {
		return a;
	}
	public void setA(Matiere a) {
		this.a = a;
	}
	public Etudiant getB() {
		return b;
	}
	public void setB(Etudiant b) {
		this.b = b;
	}
	
	
	
}
