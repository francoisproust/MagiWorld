package personnage;

public class Rodeur extends Personnage{

    public Rodeur(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe) {
        super(niveau, force, agilite, intelligence, numeroJoueur, classe);
        System.out.println(criDeGuerre() + " Je suis le Rôdeur" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Rodeur.this.getVie() + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
    }

    @Override
    public String criDeGuerre(){
        return "Bouuuhhhh";
    }

    @Override
    public void attaqueBasique(Personnage personnage){

    }

    @Override
    public void attaqueSpeciale(Personnage personnage){

    }
}
