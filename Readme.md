# Application de gestion d'une école

Ce projet aura comme but de vous mener étape par étape à la réalisation d'un petite application en Java.

## Environnement de développement.
###  *A partir de ce repository, je vous donnerai les consignes pour progresser dans vos projets.*
### *Vos projets seront disponibles dans vos repository respectifs, dans votre compte Github.*
### *Vous aurez pris le soin de me mettre comme collaborateur dans votre repository.*
### *Les correctifs seront publiés lorsque chacun de vous aurons finalisé la consigne en cours.*

## 1. Début du projet.
### *Les classes DemoApp, Personne et Etudiant sont mis à votre disposition.*
#### Vous devez mettre ce code en oeuvre localement. Et ensuite le publier sur votre Github.
### J'attire votre attention sur le points suivants :
- L'importance du respect des consignes.
- Votre code doit être correctement documenté.
- A chaque étape du projet, votre code sera évalué.

## 2. Factorisation des méthodes de saisie.
Dans le code de l'étape 1, les saisies des données pour initialisations des attributs se font dans les constructeurs de la classe Personne et Etudiant. 
Ce n'est une manière très élégante de procéder. Pour solutionner ce fait, je vous donne une classe Saisie, qui contient toutes les méthodes d'introduction des données. Pour cette étape, je vous demande d’implémenter cette classe et d'adapter le code dans les classes Personne et Etudiant. Afin que dans les constructeurs de ces classes, il n'y ai plus d'instance de la classe Scanner, mais uniquement un appel au méthode de la classe Saisie.

## 3. Réduction des méthodes de saisie pour le type String.
On constate que dans la classe Saisie, il y a 4 méthodes de type String.
- Une pour le nom.
- Une pour le Prénom.
- Une pour la saisie du nom de la classe.
- Et une pour le matricule.
#### *Pour cette étape, je vous demande d'utiliser une seule méthode de saisie. Les libellés à afficher pour l'utilisateur seront passés par paramètre de type String à la nouvelle méthode. Le return de cette méthode sera du type String.*
## 4. Gestion des exceptions.
Le rôle de la gestion des exceptions est d'anticiper les risques de blogage ou de fermeture prématurée de l'application.
Sur base du cours, vue en classe, veuillez inmplémenter les exceptions dans votre code.
Tenir compte de la javadoc pour les méthodes de la classe java et si nécessaire déclencher une exception pour un risque particulier.
Cette gestion a pour objectif de sécuriser votre programme.
## 5. Contrôle des saisies
Nous avons vu les principes de mise en oeuvre des expressions régulières. Nous avons implementé différents exemples de contrôle de validé des adresses mails, de contrôles de validés des noms et prénomns.
Pour ce chapitre, je vous demande de compléter votre code afin que :
- Mise en oeuvre d'une nouvelle proprièté dans la classe Personne, avec l'ajout d'un attribut adresseMail de type String.
- De compléter le code pour que l'adresse mail soit complétée par l'utilisateur avec une contrôle de valider de saisie.
- De compléter le code pour que l'encodage du nom et prénom répondent aux consignes suivantes :
	 * La plage de caractère Àà - Ǿǿ soit acceptée
	 * Les caractères a à z et A à A soit acceptée
	 * Il prend en compte les ' et -
	 * Le reste des caractéres ne seront pas acceptés
	 * La première lettre des noms et prénoms seront mis en majuscule, en tenant compte des noms et prénoms composés (par un tiret "-", par un guillement simple "'", ou par un simple espace.) 
***Ceci termine cette partie du projet GestionEcole. La remise de vos projets respectifs est à effectuer pour le 10/6/2024.***