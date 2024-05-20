package Personne;
import java.util.Scanner;
import java.util.Arrays;

public class Etudiant extends Personne {
	private String matricule;
	private double[] notes;
	private double moyenne;
	
	public Etudiant() {
		super();
        Scanner scan = new Scanner (System.in);
		System.out.print("Veuillez introduire son matricule ");
		this.matricule = scan.next();	
		System.out.print("l'etudiant  "+this.prenom+" "+this.nom+" possède combien de notes ");
        int nbre = scan.nextInt();

        notes = new double[nbre];
        
        int i = 0;

        while(i != notes.length){
            System.out.print("Entrer la note numero "+(i+1)+" : ");
            notes[i] = scan.nextDouble();
            i++;
        }
        this.moyenne = calculMoyenne();
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public double[] getNotes() {
		return notes;
	}

	public void setNotes(double[] notes) {
		this.notes = notes;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = calculMoyenne();
	}

	private double calculMoyenne() {
		double somme = 0;
		for(double valeurNote : notes) {
			somme = somme + valeurNote;
		}
		return somme/notes.length;
	}
	@Override
	public String toString() {
		return "Etudiant : "+super.toString();
	}
	public void affchierUnEtudaint() {
		toString();
		System.out.println("son matricule est : "+getMatricule());
		System.out.print("Ses notes sont :");
		for(double valeursNotes : notes) {
			System.out.print(" "+valeursNotes+ " - ");
		}
		System.out.println();
		System.out.println("Sa moyenne est de : "+getMoyenne());
		
	}

}