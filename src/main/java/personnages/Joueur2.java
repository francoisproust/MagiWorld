package personnages;

public class Joueur2 extends Personnage {
    private String motMagique;

    /**
     * Methode permettant la création du joueur 1
     */
    public void creationJoueur() {
        Joueur2 personne = new Joueur2();
        personne.choixType();
        personne.choixCaracteristiques();
        motMagique = motMagique(personne.getChoixPersonnage());
        System.out.println(motMagique + " Je suis le " + personne.getChoixPersonnage() + " Joueur 2 de niveau "
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
