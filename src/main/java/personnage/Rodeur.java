package personnage;

public class Rodeur extends Personnage{

    /**
     * Méthode permettant la création d'un Rodeur
     * @param niveau niveau du joueur
     * @param force force du joueur
     * @param agilite agilite du joueur
     * @param intelligence intelligence du joueur
     * @param numeroJoueur numero de joueur
     * @param classe classe de personnage
     */
    public Rodeur(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe) {
        super(niveau, force, agilite, intelligence, numeroJoueur, classe);
        System.out.println(criDeGuerre() + " Je suis le Rôdeur" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Rodeur.this.getVie() + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
    }

    /**
     * Methode retournant le cri du personnage
     * @return le cri du personnagge
     */
    @Override
    public String criDeGuerre(){
        return "Bouuuhhhh";
    }

    /**
     * Methode définissant l'attaque Basique
     * @param personnage Classe du personnage
     */
    @Override
    public void attaqueBasique(Personnage personnage){
        int dommage;
        dommage = this.getAgilite();
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Tir à l'arc et inflige " + dommage);
        personnage.setVie(personnage.getVie() - dommage);
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage);
    }

    /**
     * Methode définissant l'attaque Spéciale
     * @param personnage Classe du personnage
     */
    @Override
    public void attaqueSpeciale(Personnage personnage){
        int gain;
        gain = this.getNiveau() / 2;
        this.setAgilite(this.getAgilite() + (this.getNiveau() / 2)) ;
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Concentration et gagne " + gain + " en agilité");
    }
}
