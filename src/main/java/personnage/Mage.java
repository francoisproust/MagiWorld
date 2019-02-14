package personnage;

public class Mage extends Personnage{
    private int vie;
    public Mage(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe) {
        super(niveau, force, agilite, intelligence, numeroJoueur,classe);
        System.out.println(criDeGuerre() + " Je suis le Mage" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Mage.this.vie + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
    }

    @Override
    public String criDeGuerre(){
        return "Abracadabra";
    }

    @Override
    public void attaqueBasique(Personnage personnage){

    }

    @Override
    public void attaqueSpeciale(Personnage personnage){

    }
}
