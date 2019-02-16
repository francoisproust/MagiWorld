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

    /**
     * Methode retournant le cri du personnage
     * @return le cri du personnagge
     */
    @Override
    public String criDeGuerre() {

        return "Woarg";
    }

    /**
     * Methode définissant l'attaque Basique
     * @param personnage Classe du personnage
     */
    @Override
    public void attaqueBasique(Personnage personnage){
        int dommage;
        dommage = this.getForce();
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Coup d'épée et inflige " + dommage);
        personnage.setVie(personnage.getVie() - dommage);
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage);
    }

    /**
     * Methode définissant l'attaque Spéciale
     * @param personnage Classe du personnage
     */
    @Override
    public void attaqueSpeciale(Personnage personnage){
        int dommage;
        dommage = this.getForce() * 2 ;
        System.out.println("Le joueur " + this.getNumeroJoueur() + " utilise Coup de Rage et inflige " + dommage);
        personnage.setVie(personnage.getVie() - dommage);
        this.setVie(this.getVie() - (this.getForce()/2));
        System.out.println("Le joueur " + personnage.getNumeroJoueur() + " perd " + dommage);
    }

}
