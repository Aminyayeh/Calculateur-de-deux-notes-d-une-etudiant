package amin;

public class Note {
	public Matiere Id_mati�re ;
	public float Moyen_Semestre1;
	public float Moyen_Semestre2 ;
	public float Resultat_Annee ;
	public String admin ;
	
	public Note(Matiere id_mati�re, float moyen_Semestre1, float moyen_Semestre2, float resultat_Ann�e, String admin) {
		
		Id_mati�re = id_mati�re;
		Moyen_Semestre1 = moyen_Semestre1;
		Moyen_Semestre2 = moyen_Semestre2;
		Resultat_Annee = resultat_Ann�e;
		this.admin = admin;
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
		return Moyen_Semestre1;
	}

	public void setMoyen_Semestre1(float moyen_Semestre1) {
		Moyen_Semestre1 = moyen_Semestre1;
	}

	public float getMoyen_Semestre2() {
		return Moyen_Semestre2;
	}

	public void setMoyen_Semestre2(float moyen_Semestre2) {
		Moyen_Semestre2 = moyen_Semestre2;
	}

	public float getResultat_Annee() {
		return Resultat_Annee;
	}

	public void setResultat_Annee(float resultat_Annee) {
		Resultat_Annee = resultat_Annee;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	

}
