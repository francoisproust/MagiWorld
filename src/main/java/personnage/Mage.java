package personnage;

public class Mage extends Personnage{
    private int vieInitial;

    /**
     * Méthode permettant la création d'un Rodeur
     * @param niveau niveau du joueur
     * @param force force du joueur
     * @param agilite agilite du joueur
     * @param intelligence intelligence du joueur
     * @param numeroJoueur numero de joueur
     * @param classe classe de personnage
     */
    public Mage(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe) {
        super(niveau, force, agilite, intelligence, numeroJoueur,classe);
        System.out.println(criDeGuerre() + " Je suis le Mage" + " Joueur " + numeroJoueur + " de niveau "
                + niveau + " je possède " + Mage.this.getVie() + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !");
        vieInitial = Mage.this.getVie();
    }

    /**
     * Methode retournant le cri du personnage
     * @return le cri du personnagge
     */
    @Override
    public String criDeGuerre(){

        return "Abracadabra";
    }

    /**
     * Methode définissant l'attaque Basique
     * @param personnage Classe du personnage
     */
    @Override
    public void attaqueBasique(Personnage personnage){
        int dommage;
        dommage = this.getIntelligence();
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Boule de feu et inflige " + dommage + " dommages");
        personnage.setVie(personnage.getVie() - dommage);
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage + " point de vie");
    }

    /**
     * Methode définissant l'attaque Spéciale
     * @param personnage Classe du personnage
     */
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
