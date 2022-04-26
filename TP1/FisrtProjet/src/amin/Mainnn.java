package amin;

import java.util.Scanner;

public class Mainnn {
/**
 * Author Ibrahim
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Saisir de l'Etudiant
		System.out.println("Saisir de l'Etudiant");
		System.out.println("Saisir le id");
		int idEt = sc.nextInt();
		System.out.println("Saisir le nom");
		String nomEt = sc.next();
		System.out.println("Saisir le Prenom");
		String prenomEt = sc.next();
		System.out.println("Saisir l'adresse");
		String adresseEt = sc.next();
		System.out.println("Saisir l'email");
		String emailEt = sc.next();
		
		Etudiant et = new Etudiant(idEt,nomEt,prenomEt,adresseEt,emailEt);
		
		//Saisir de Matiere"
		System.out.println("Saisir la Matiere");
		System.out.println("Saisir id de matiere");
		int idMa = sc.nextInt();
		System.out.println("Saisir nom de matiere");
		String nomMa = sc.next();
		System.out.println("Saisir nom de coefficient");
		String coefficientMa = sc.next();
		Matiere ma = new Matiere(idMa,nomMa,coefficientMa);
		
		
		//creation de la matiere et etudiant
		MatEtudiant me = new MatEtudiant(ma,et);
		
		//Saisir le note
		System.out.println("Saisir la note");
		Note no = new Note();
		
		no.setId_matière(ma);
		System.out.println("Saisir le note 1");
		float note1 = sc.nextFloat();
		no.setNote1(note1);
		System.out.println("Saisir le note 2");
		float note2 = sc.nextFloat();
		no.setNote2(note2);
		
		
		Calculer(no , et , ma );
		
		
	}
	
	public static void Calculer(Note no, Etudiant et , Matiere ma) {
		
		float moyen = 0 , somme = 0; 
		float note1 = no.getNote1();
		float note2 = no.getNote2();
		somme = note1 + note2 ; 
		moyen = somme/2;
		if(moyen>=10) {
			no.setResultat_Annee(moyen);
			no.setAdmis("Admis");
		}
		else {
			no.setResultat_Annee(moyen);
			no.setAdmis("Ajournée");
		}
		System.out.println("------------------Affichage-----------------------------");
		System.out.println("l'etudiant : "+et.getNom()+et.getPrenom()+"\nId matiere : "+ma.getNom()+"\nnote1 : "+no.getNote1()+
				"\nnote2 : "+no.getNote2()+"\nMoyen general :"+no.getResultat_Annee()+
				"\nResultat Année :"+no.getAdmis());

	}

}
