package Personne;
import java.util.Scanner;

public class Saisie {
	Scanner scan = new Scanner(System.in);
	
	public String SaiseNom() {
		System.out.print("Entrer le nom de la personne ");
	    return  scan.next();		
	}
	public String SaiseNomClasse() {
		System.out.print("Entrer le nom de la classe ");
	    return  scan.next();		
	}
	public String SaisePrenom() {
		System.out.print("Entrer le prénom de la personne ");
	    return  scan.next();		
	}
	public int SaisieAge() {
		System.out.print("Entrer son âge ");
		return scan.nextInt();
	}  
	public String SaiseMatricule() {
		System.out.print("Entrer le matricule de l'étudiant ");
	    return  scan.next();		
	}
	public double[] SaisieNotes(String nom, String prenom) {
		System.out.print("l'etudiant  "+prenom+" "+nom+" possède combien de notes ");
        int nbre = scan.nextInt();

        double[] notes = new double[nbre];
        
        int i = 0;

        while(i != notes.length){
            System.out.print("Entrer la note numero "+(i+1)+" : ");
            notes[i] = scan.nextDouble();
            i++;
        }
		return notes;
	}
	public Etudiant[] SaisieEleves() {
		System.out.println("Saisir le nombre d'élèves pour cette classe : ");
		int nbEtudiant  = scan.nextInt();
		Etudiant[] classe = new Etudiant[nbEtudiant];
        //this.classe = new Etudiant[nbEtudiant];
        for(int i = 0; i < classe.length; i++ ){
            classe[i] = new Etudiant();
        }
        return classe;
	}
}
