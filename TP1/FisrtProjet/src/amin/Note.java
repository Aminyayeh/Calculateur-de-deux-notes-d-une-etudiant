package amin;

public class Note {
	public Matiere Id_matière ;
	public float Moyen_Semestre1;
	public float Moyen_Semestre2 ;
	public float Resultat_Annee ;
	public String admin ;
	
	public Note(Matiere id_matière, float moyen_Semestre1, float moyen_Semestre2, float resultat_Année, String admin) {
		
		Id_matière = id_matière;
		Moyen_Semestre1 = moyen_Semestre1;
		Moyen_Semestre2 = moyen_Semestre2;
		Resultat_Annee = resultat_Année;
		this.admin = admin;
	}
	
	public Note() {
		
	}

	public Matiere getId_matière() {
		return Id_matière;
	}

	public void setId_matière(Matiere id_matière) {
		Id_matière = id_matière;
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
