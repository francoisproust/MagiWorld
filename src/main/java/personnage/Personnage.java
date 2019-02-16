package personnage;

public abstract class Personnage {
    private int niveau;
    private int force;
    private int agilite;
    private int intelligence;
    private int vie;
    private int numeroJoueur;
    private String classe;

    /**
     * Constructeur permettant la création d'un joueur
     * @param niveau niveau du joueur
     * @param force force du joueur
     * @param agilite agilite du joueur
     * @param intelligence intelligence du joueur
     * @param numeroJoueur numero de joueur
     * @param classe classe de personnage
     */
    public Personnage(int niveau, int force, int agilite, int intelligence, int numeroJoueur, String classe){
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.vie = niveau * 5;
        this.numeroJoueur = numeroJoueur;
        this.classe = classe;
    }

    /**
     * Methode retournant le cri du personnage
     * @return le cri du personnagge
     */
    public abstract String criDeGuerre();

    /**
     * Methode définissant l'attaque Basique
     * @param personnage Classe du personnage
     */
    public abstract void attaqueBasique(Personnage personnage);

    /**
     * Methode définissant l'attaque Spéciale
     * @param personnage Classe du personnage
     */
    public abstract void attaqueSpeciale(Personnage personnage);

    public int getNiveau() {

        return niveau;
    }

    public void setNiveau(int niveau) {

        this.niveau = niveau;
    }

    public int getForce() {

        return force;
    }

    public void setForce(int force) {

        this.force = force;
    }

    public int getAgilite() {

        return agilite;
    }

    public void setAgilite(int agilite) {

        this.agilite = agilite;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {

        this.vie = vie;
    }

    public int getNumeroJoueur() {

        return numeroJoueur;
    }

    public void setNumeroJoueur(int numeroJoueur) {

        this.numeroJoueur = numeroJoueur;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
