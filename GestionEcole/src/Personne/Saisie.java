package Personne;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Classe de saisie des informations, interface utilisateur.
 * @author xavier
 */
public class Saisie {
	Scanner scan = new Scanner(System.in);
	/**
	 * Méthode de saisie des données de type String
	 * La saisie est mise dans une boucle qui permet à l'utilisateur d'introduire correctement les données demandées
	 * @param libelle
	 * @return
	 */
	public String SaiseTexte(String libelle) {

		String texte = null;
		System.out.print("Veuillez saisir le "+libelle+" : ");
		boolean loop = false;						
		 while (!loop) {										
			 try {			
				 texte = scan.nextLine();
				 if (texte == null || texte.isBlank()) {
					 System.out.println("Aucune valeur introduite !");
				 }else {
					 loop = true;					
				 }				
			 } catch (NoSuchElementException e) {
				 //vider();
				 System.out.println("Erreur, Aucune ligne n'a été trouvée");
			 }catch(IllegalStateException e) {
				 //vider();
				 System.out.println("Erreur, le Scanner est fermé");
			 }
		}		 
		return texte;		
		 }

	/**
	 * Méthode de type integer pour saisir des données numérique de type entier
	 * La saisie est liée à un boucle pour permettre à l'utilisateur d'encoder correctement la donnée demandée
	 * @return
	 */
	public int SaisirEntier(String libelle) {		
		System.out.print("Veuillez sasir "+libelle+" : ");			
		boolean valid = false;
		String strtValue;
		int intValue = 0;
		while (!valid) {
			try {
				strtValue = scan.nextLine();
				intValue = Integer.parseInt(strtValue);
				valid = true;
			} 
			catch (NumberFormatException e) {
				System.out.println("Saisir un entier erreur !");				
			}
			catch (NoSuchElementException e) {
				System.out.println("Saisir un entier, aucune donnée trouvée !");				
			}
			catch (IllegalStateException e) {
				System.out.println("Saisir un entier, aucune saisie possible !");
			}
		}		
		return intValue;

	}  
	/**
	 * Méthode de type double pour saisir des données numérique de type double
	 * La saisie est liée à un boucle pour permettre à l'utilisateur d'encoder correctement la donnée demandée
	 * @return
	 */
	public double SaisirDouble() {		

		double result = 0; 
		boolean loop = false;						
		while (!loop) {										
			try {				
				result = scan.nextDouble();
				loop = true;				
			}
			catch(InputMismatchException e) {		
				//vider();
				System.out.println("Erreur ! Veuillez introduire un nombre !");
			}		
			catch (NoSuchElementException e) {
				//vider();
				System.out.println("Erreur, Aucune ligne n'a été trouvée");
			}catch(IllegalStateException e) {
				//vider();
				System.out.println("Erreur, le Scanner est fermé");
			}
		}
		return result;
	}  
	/**
	 * Méthode de saisie des notes d'un éléve, cette méthode permet de stocker les notes dans un tableau de type double.
	 * Le tableau est initilisé à la suite de saisie du nombre de notes.
	 * La saisie des valeurs est effectuée via une méthodes de saisie pour valeurs de type doubles
	 * @param nom
	 * @param prenom
	 * @return
	 */
	public double[] SaisieNotes(String nom, String prenom) {
		//System.out.print("l'etudiant  "+prenom+" "+nom+" possède combien de notes ");
        int nbre = SaisirEntier("le nombre de notes de "+prenom+" "+nom );

        double[] notes = new double[nbre];
        
        int i = 0;

        while(i != notes.length){
            System.out.print("Entrer la note numero "+(i+1)+" : ");
            notes[i] = SaisirDouble();
            i++;
        }
		return notes;
	}
	/**
	 * Méthode de saisie des éléves pour une classe.
	 * La classe est constituée par un tableau d'éléves.
	 * Pour remplir le tableau, ceci doit-être initialisé, par la saisie du nombre d'éléves dans la classe.
	 * @return
	 */
	public Etudiant[] SaisieEleves() {
		int nbEtudiant  = SaisirEntier("le nombre d'élèves pour cette classe : ");
		Etudiant[] classe = new Etudiant[nbEtudiant];
        
        for(int i = 0; i < classe.length; i++ ){
        	System.out.println("'*-----------------------------------------*");
            classe[i] = new Etudiant();
        }
        return classe;
	}
	/**
	 * Si on souhaite scanner avec la méthode nextLine() une chaîne de caractère après avoir scanné un nombre, 
	 * cette méthode se contentera de faire un retour à la ligne et la variable String sera vide.
	 * D'où l'utilité de vider le scanner (par un retour à la ligne) avec <nomduScanner>.nextLine(); après avoir scanné un nombre
	 */
	/*
	 * public void vider(){ try { scan.nextLine(); } catch (NoSuchElementException
	 * e) { vider(); System.out.println("Erreur, Aucune ligne n'a été trouvée");
	 * }catch(IllegalStateException e) { vider();
	 * System.out.println("Erreur, le Scanner est fermé"); } }
	 */
}
