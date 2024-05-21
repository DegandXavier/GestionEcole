package Personne;

public class DemoApp {

	public static void main(String[] args) {
		
		/*
		 * Etudiant loic = new Etudiant(); loic.affchierUnEtudaint();
		 */
		 
		/*
		 * Personne pers = new Personne(); System.out.println(pers.toString());
		 */
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
