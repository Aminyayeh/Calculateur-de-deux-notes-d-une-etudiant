package amin;

public class Note {
	public Matiere Id_mati�re ;
	public float note1;
	public float note2 ;
	public float moyen ;
	public String admis ;
	
	public Note(Matiere id_mati�re, float moyen_Semestre1, float moyen_Semestre2, float resultat_Ann�e, String admin) {
		
		Id_mati�re = id_mati�re;
		note1 = moyen_Semestre1;
		note2 = moyen_Semestre2;
		moyen = resultat_Ann�e;
		this.admis = admin;
	}
	
	public Note() {
		
	}

	public Matiere getId_mati�re() {
		return Id_mati�re;
	}

	public void setId_mati�re(Matiere id_mati�re) {
		Id_mati�re = id_mati�re;
	}

	public float getMoyen_Semestre1() {
		return note1;
	}

	public void setMoyen_Semestre1(float moyen_Semestre1) {
		note1 = moyen_Semestre1;
	}

	public float getMoyen_Semestre2() {
		return note2;
	}

	public void setMoyen_Semestre2(float moyen_Semestre2) {
		note2 = moyen_Semestre2;
	}

	public float getResultat_Annee() {
		return moyen;
	}

	public void setResultat_Annee(float resultat_Annee) {
		moyen = resultat_Annee;
	}

	public String getAdmin() {
		return admis;
	}

	public void setAdmin(String admin) {
		this.admis = admin;
	}

	

}
