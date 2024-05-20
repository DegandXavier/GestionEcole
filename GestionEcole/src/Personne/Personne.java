package Personne;

import java.util.Scanner;

public class Personne {
	protected String nom, prenom;
	protected int age;
	
	public Personne() {
		Scanner scan  =new Scanner(System.in);
		System.out.print("Entrer le nom de la personne ");
	    this.nom = scan.next();
	    System.out.print("Entrer le prenom de la personne ");
        this.prenom = scan.next();
        System.out.print("Entrer son âge ");
        this.age = scan.nextInt();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Nom : "+this.nom+"\n"+"Prénom : "+this.prenom+"\n"+"Agé de : "+this.age+ " ans.";
	}

}
