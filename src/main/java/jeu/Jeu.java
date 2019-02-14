package jeu;

import personnage.Guerrier;
import personnage.Mage;
import personnage.Personnage;
import personnage.Rodeur;


import java.util.Scanner;

public class Jeu {
    private Personnage joueur1;
    private Personnage joueur2;
    Scanner sc = new Scanner(System.in);

    public Jeu(){
        joueur1 = creationJoueur(1);
        joueur2 = creationJoueur(2);
        deroulementJeu (joueur1,joueur2);
    }

    public void deroulementJeu(Personnage joueur1,Personnage joueur2){
        while(joueur1.getVie() >0 && joueur2.getVie() >0){
            choixAttaque();
        }
    }

    private void choixAttaque(){
        
    }
    /**
     * Méthode permettant la création d'un joueur
     * @param numeroJoueur
     * @return le joueur créé
     */
    private  Personnage creationJoueur(int numeroJoueur) {
        String classe;
        int niveau , force, agilite, intelligence;
        String caracteristiques[];
        System.out.println("Création du joueur " + numeroJoueur);
        classe = classePersonnage();
        caracteristiques = caracterisquesPersonnage().split(" ");
        niveau = Integer.valueOf(caracteristiques[0]);
        force = Integer.valueOf(caracteristiques[1]);
        agilite = Integer.valueOf(caracteristiques[2]);
        intelligence = Integer.valueOf(caracteristiques[3]);
        if (classe.equals("Guerrier")){
            Guerrier guerrier = new Guerrier(niveau , force, agilite, intelligence, numeroJoueur, classe);
            return  guerrier;
        }else if(classe.equals("Rôdeur")){
            Rodeur rodeur = new Rodeur(niveau , force, agilite, intelligence, numeroJoueur, classe);
            return rodeur;
        }else{
            Mage mage = new Mage(niveau , force, agilite, intelligence, numeroJoueur, classe);
            return mage;
        }
    }

    /**
     * Methode déterminant la classe de personnage
     * @return la classe de personnage
     */
    public String classePersonnage(){
        int temp;
        String classe;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier , 2 : Rôdeur , 3 Mage )");
        temp = sc.nextInt();
        while (temp != 1 && temp != 2 && temp != 3) {
            System.out.println("Le choix n'est pas dans la liste");
        }
        switch (temp){
            case 1:
                classe = "Guerrier";
                break;
            case 2:
                classe = "Rôdeur";
                break;
            case 3:
                classe = "Mage";
                break;
            default:
                classe = "null";
        }
        return classe;
    }

    /**
     * Méthode récupérant les caractéristiques du personnage
     * @return concatenation avec un espace des caractéristiques
     */
    public  String caracterisquesPersonnage(){
        int niveau;
        int force;
        int agilite;
        int intelligence;
        do {
            System.out.println("Niveau du personnage ?");
            niveau = sc.nextInt();
            System.out.println("Force du personnage ?");
            force = sc.nextInt();
            System.out.println("Agilité du personnage ?");
            agilite = sc.nextInt();
            System.out.println("Intelligence du personnage ?");
            intelligence = sc.nextInt();
            if ((force + agilite + intelligence) != niveau)
                System.out.println("Le niveau doit être égal à la somme de la force, de l'agilité et de l'intelligence");
        } while ((force + agilite + intelligence) != niveau);
        return niveau + " " + force + " " + agilite + " " + intelligence;
    }
}
