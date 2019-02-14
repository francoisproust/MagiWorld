package personnage;

public class Guerrier extends Personnage {

    /**
     * Constructeur permettant la création d'un joueur
     * @param niveau niveau du joueur
     * @param force force du joueur
     * @param agilite agilite du joueur
     * @param intelligence intelligence du joueur
     * @param numeroJoueur numero de joueur
     */
    public Guerrier(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe){
        super(niveau, force, agilite, intelligence, numeroJoueur, classe);
        System.out.println(criDeGuerre() + " Je suis le Guerrier" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Guerrier.this.getVie() + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
    }

    @Override
    public String criDeGuerre() {
        return "Woarg";
    }

    @Override
    public void attaqueBasique(Personnage personnage){

    }

    @Override
    public void attaqueSpeciale(Personnage personnage){

    }

}
