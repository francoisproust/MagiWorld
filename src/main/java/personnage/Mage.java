package personnage;

public class Mage extends Personnage{
    private int vieInitial;
    public Mage(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe) {
        super(niveau, force, agilite, intelligence, numeroJoueur,classe);
        System.out.println(criDeGuerre() + " Je suis le Mage" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Mage.this.getVie() + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
        vieInitial = Mage.this.getVie();
    }

    @Override
    public String criDeGuerre(){

        return "Abracadabra";
    }

    @Override
    public void attaqueBasique(Personnage personnage){
        int dommage;
        dommage = this.getIntelligence();
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Boule de feu et inflige " + dommage);
        personnage.setVie(personnage.getVie() - dommage);
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage);
    }

    @Override
    public void attaqueSpeciale(Personnage personnage){
        int gain;
        gain = this.getIntelligence() * 2;
        this.setVie( this.getVie() + (this.getIntelligence() * 2)) ;
        if(this.getVie() > vieInitial){
            this.setVie(vieInitial);
        }

        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Soin et gagne " + gain + " en vitalité");
    }
}
