package amin;

/**
 * 
 * @author Amin Yayeh
 *
 */

public class Note {
	private Matiere Id_matière ;
	private float note1;
	private float note2 ;
	private float moyen ;
	private String admis ;
	
	public Note(Matiere id_matière, float moyen_Semestre1, float moyen_Semestre2, float resultat_Année, String admin) {
		
		Id_matière = id_matière;
		note1 = moyen_Semestre1;
		note2 = moyen_Semestre2;
		moyen = resultat_Année;
		this.admis = admin;
	}
	
	public Note() {
		
	}

	public Matiere getId_matière() {
		return Id_matière;
	}

	public void setId_matière(Matiere id_matière) {
		Id_matière = id_matière;
	}

	public float getNote1() {
		return note1;
	}

	public void setNote1(float moyen_Semestre1) {
		note1 = moyen_Semestre1;
	}

	public float getNote2() {
		return note2;
	}

	public void setNote2(float moyen_Semestre2) {
		note2 = moyen_Semestre2;
	}

	public float getResultat_Annee() {
		return moyen;
	}

	public void setResultat_Annee(float resultat_Annee) {
		moyen = resultat_Annee;
	}

	public String getAdmis() {
		return admis;
	}

	public void setAdmis(String admin) {
		this.admis = admin;
	}

	

}
