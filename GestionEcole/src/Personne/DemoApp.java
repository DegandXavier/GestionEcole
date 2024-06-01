package Personne;

public class DemoApp {

	public static void main(String[] args) {
		
		Classe laClasse = new Classe();
		// Affichage sans tri
		System.out.println("------------------");
		System.out.println("Affichage sans tri");
		System.out.println("------------------");
		laClasse.afficherLaclasse();
		// Tri par valeurs croissante des moyennes
		laClasse.trier();
		// Affichage après tri
		System.out.println("------------------");
		System.out.println("Affichage avec tri");
		System.out.println("------------------");
		laClasse.afficherLaclasse();
	}

}
