package Personne;

public class Personne {
	protected String nom, prenom;
	protected int age;
	
	public Personne() {
		Saisie get = new Saisie();
	    this.nom = get.SaiseTexte("nom");	    
        this.prenom = get.SaiseTexte("prénom");        
        this.age = get.SaisirEntier(" son âge :");
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
