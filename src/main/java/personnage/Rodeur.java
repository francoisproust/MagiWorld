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
        int dommage;
        dommage = this.getAgilite();
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Tir à l'arc et inflige " + dommage);
        personnage.setVie(personnage.getVie() - dommage);
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage);
    }

    @Override
    public void attaqueSpeciale(Personnage personnage){
        int gain;
        gain = this.getNiveau() / 2;
        this.setAgilite(this.getAgilite() + (this.getNiveau() / 2)) ;
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Concentration et gagne " + gain + " en agilité");
    }
}
