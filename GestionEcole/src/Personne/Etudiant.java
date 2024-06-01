package Personne;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Etudiant extends Personne {
	private String matricule;
	private double[] notes;
	private double moyenne;
	
	public Etudiant() {
		super();
        Saisie get = new Saisie();
		this.matricule = get.SaiseTexte("numéro de matricule");	
		this.notes = get.SaisieNotes(this.nom, this.prenom);
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

	public void affchierUnEtudaint() {
		DecimalFormat formatage = new DecimalFormat();
		formatage.setMaximumIntegerDigits(2);
		System.out.println("Données élève : "+"\n"+super.toString());
		System.out.println("son matricule est : "+getMatricule());
		System.out.print("Ses notes sont :");
		String lesNotes = " ";
		for(double valeursNotes : notes) {
			lesNotes = lesNotes+" - "+valeursNotes;			
		}
		System.out.print(lesNotes.substring(3));
		System.out.println();
		System.out.println("Sa moyenne est de : "+formatage.format(getMoyenne()));
		
	}

}
