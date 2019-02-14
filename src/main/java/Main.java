import personnages.Joueur1;
import personnages.Joueur2;
import personnages.Personnage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Création du personnage du Joueur 1");
        Joueur1 joueur1 = new Joueur1();
        joueur1.creationJoueur();
        System.out.println("Création du personnage du Joueur 2");
        Joueur2 joueur2 = new Joueur2();
        joueur2.creationJoueur();
    }
}
