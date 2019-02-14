package personnages;

import java.util.Scanner;

public abstract class Personnage {
    Scanner sc = new Scanner(System.in);
    private String choixPersonnage;
    private int niveau;
    private int force;
    private int agilite;
    private int intelligence;
    private int vie;


    /**
     * Méthode permettant la sélection de la classe du personnage
     */
    public void choixType(){
        int choix = 0;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier , 2 : Rôdeur , 3 Mage )");
        while(choix != 1 && choix != 2 && choix != 3){
            choix = sc.nextInt();
        }
        switch (choix){
            case 1:
                setChoixPersonnage("Guerrier");
                break;
            case 2:
                setChoixPersonnage("Rôdeur");
                break;
            case 3:
                setChoixPersonnage("Mage");
                break;
            default:
                setChoixPersonnage("null");
        }
    }

    /**
     * Méthode permettant de définir les caractérisques du personnage
     */
    public void choixCaracteristiques(){
            setNiveau(niveau());
            setForce(force());
            setAgilite(agilite());
            setIntelligence(intelligence());
            setVie(getNiveau() * 5);
        if (getNiveau() != getAgilite() + getForce() + getIntelligence()){
            System.out.println("La somme de l'agilité, de la force et de l'Intelligence doit être égale au Niveau");
            do{
                setNiveau(niveau());
                setForce(force());
                setAgilite(agilite());
                setIntelligence(intelligence());
                setVie(getNiveau() * 5);
            }while(getNiveau() != getAgilite() + getForce() + getIntelligence());
        }
    }

    /**
     * Méthode permettant la séléction de l'intelligence du personnage
     * @return intelligence du personnage
     */
    private int intelligence(){
        System.out.println("Intelligence du personnage (entre 0 et 100)");
        intelligence = sc.nextInt();
        while( intelligence<0 && intelligence >100 ){
            System.out.println("Intelligence du personnage n'est pas comprise  entre 0 et 100 ");
            intelligence = sc.nextInt();
        };
        return intelligence;
    }

    /**
     * Méthode permettant la séléction du Agilité du personnage
     * @return agilite du personnage
     */
    private int agilite(){
        System.out.println("Agilité du personnage (entre 0 et 100)");
        agilite = sc.nextInt();
        while( agilite<1 && agilite >100 ){
            System.out.println("L'agilité du personnage n'est pas comprise  entre 0 et 100 ");
            agilite = sc.nextInt();
        }
        return agilite;
    }

    /**
     * Méthode permettant la séléction du Niveau du personnage
     * @return niveau du personnage
     */
    private int niveau(){
        System.out.println("Niveau du personnage (entre 1 et 100)");
        niveau = sc.nextInt();
        while( niveau<1 && niveau >100 ){
            System.out.println("Le niveau du personnage n'est pas comprise  entre 1 et 100 ");
            niveau = sc.nextInt();
        }
        return niveau;
    }

    /**
     * Méthode permettant la séléction de la Force du personnage
     * @return force du personnage
     */
    private int force(){
        System.out.println("Force du personnage (entre 0 et 100)");
        force = sc.nextInt();
        while( force <0 && force >100 ){
            System.out.println("La force du personnage n'est pas comprise  entre 0 et 100 ");
            force = sc.nextInt();
        }
        return force;
    }

    public String getChoixPersonnage() {
        return choixPersonnage;
    }

    public void setChoixPersonnage(String choixPersonnage) {
        this.choixPersonnage = choixPersonnage;
    }

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

    @Override
    public String toString() {
        return "Personnage{" +
                "choixPersonnage=" + choixPersonnage +
                ", niveau=" + niveau +
                ", force=" + force +
                ", agilite=" + agilite +
                ", intelligence=" + intelligence +
                ", vie=" + vie +
                '}';
    }
}
