package amin;

import java.util.Scanner;

public class Mainnn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Saisir de l'Etudiant
		System.out.println("Saisir de l'Etudiant");
		System.out.println("Saisir le id");
		int a = sc.nextInt();
		System.out.println("Saisir le nom");
		String b = sc.next();
		System.out.println("Saisir le Prenom");
		String c = sc.next();
		System.out.println("Saisir l'adresse");
		String d = sc.next();
		System.out.println("Saisir l'email");
		String e = sc.next();
		
		Etudiant et = new Etudiant(a,b,c,d,e);
		
		//Saisir de Matiere"
		System.out.println("Saisir la Matiere");
		System.out.println("Saisir id de matiere");
		int id = sc.nextInt();
		System.out.println("Saisir nom de matiere");
		String nom = sc.next();
		System.out.println("Saisir nom de coefficient");
		String co = sc.next();
		Matiere ma = new Matiere(id,nom,co);
		
		
		//creation de la matiere et etudiant
		MatEtudiant me = new MatEtudiant(ma,et);
		
		//Saisir le note
		System.out.println("Saisir la note");
		Note no = new Note();
		
		no.setId_matière(ma);
		System.out.println("Saisir le note 1");
		float note1 = sc.nextFloat();
		no.setMoyen_Semestre1(note1);
		System.out.println("Saisir le note 2");
		float note2 = sc.nextFloat();
		no.setMoyen_Semestre2(note2);
		
		
		Calculer(no , et , ma );
		
		
	}
	
	public static void Calculer(Note no, Etudiant et , Matiere ma) {
		
		float moyen = 0 , somme = 0; 
		float note1 = no.getMoyen_Semestre1();
		float note2 = no.getMoyen_Semestre2();
		somme = note1 + note2 ; 
		moyen = somme/2;
		if(moyen>=10) {
			no.setResultat_Annee(moyen);
			no.setAdmin("Admis");
		}
		else {
			no.setResultat_Annee(moyen);
			no.setAdmin("Ajournée");
		}
		System.out.println("------------------Affichage-----------------------------");
		System.out.println("l'etudiant : "+et.getNom()+et.getPrenom()+"\nId matiere : "+ma.getNom()+"\nnote1 : "+no.getMoyen_Semestre1()+
				"\nnote2 : "+no.getMoyen_Semestre2()+"\nMoyen general :"+no.getResultat_Annee()+
				"\nResultat Année :"+no.getAdmin());

	}

}
