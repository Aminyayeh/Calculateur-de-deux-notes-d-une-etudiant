package amin;

public class Note {
	public Matiere Id_matière ;
	public float note1;
	public float note2 ;
	public float moyen ;
	public String admis ;
	
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
