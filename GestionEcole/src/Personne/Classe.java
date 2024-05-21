package Personne;
import java.util.Scanner;

public class Classe {
	private Etudiant[] classe;
	private String nomClasse;
	/**
	 * Création d'une classe 
	 */
	public Classe() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir le nom de la classe : ");
		this.nomClasse = scan.next();
		System.out.println("Saisir le nombre d'élèves pour cette classe : ");
		int nbEtudiant  = scan.nextInt();

        this.classe = new Etudiant[nbEtudiant];
        for(int i = 0; i < classe.length; i++ ){
            this.classe[i] = new Etudiant();
        }
	}
	public void afficherLaclasse(){
		System.out.println("La classe "+this.nomClasse+" est composée de ");
        for(Etudiant eleve : classe){
            eleve.affchierUnEtudaint();
            System.out.println(eleve.getNom());
        }
    }
}