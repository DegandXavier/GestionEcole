package Personne;
import java.util.Arrays;

public class Classe {
	private Etudiant[] classe;
	private String nomClasse;
	/**
	 * Création d'une classe 
	 */
	public Classe() {
		Saisie get = new Saisie();
		this.nomClasse = get.SaiseTexte("nom de la classe ");
		this.classe = get.SaisieEleves();
	}
	public void afficherLaclasse(){
		System.out.println("La classe "+this.nomClasse+" est composée de ");
        for(Etudiant eleve : classe){
            eleve.affchierUnEtudaint();            
        }
    }
	public void trier() {
		 Etudiant tempo;
         int i = 0;
         int j = 0;
         while(i != classe.length){
             j = i + 1;
             while(j != classe.length){
                if((classe[i] != null) && classe[i].getMoyenne() > classe[j].getMoyenne()){
                    tempo = classe[i];
                    classe[i] = classe[j];
                    classe[j] = tempo;
                }
                 j= j + 1;
             }
            i++;
         }
     }
	
}
