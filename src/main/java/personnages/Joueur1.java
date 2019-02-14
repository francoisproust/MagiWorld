package personnages;

public class Joueur1 extends Personnage {
    private String motMagique;

    /**
     * Methode permettant la création du joueur 1
     */
    public void creationJoueur() {
        Joueur1 personne = new Joueur1();
        personne.choixType();
        personne.choixCaracteristiques();
        motMagique = motMagique(personne.getChoixPersonnage());
        System.out.println(motMagique + " Je suis le " + personne.getChoixPersonnage() + " Joueur 1 de niveau "
                + personne.getNiveau() + " je possède " + personne.getVie() + " de vitalité, "
                + personne.getForce() + " de force, " + personne.getAgilite() + " d'agilité et "
                + personne.getIntelligence() + " d'intelligence !");
    }

    private String motMagique(String type) {
        switch (type) {
            case "Guerrier":
                motMagique = "Woarg";
                break;
            case "Mage":
                motMagique = "Abracadabra";
                break;
            case "Rôdeur":
                motMagique = "Bouuhhh";
                break;
            default:
                motMagique = "null";
        }
        return motMagique;
    }
}
