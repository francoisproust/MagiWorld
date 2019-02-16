package personnage;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAtttaque {
    @Test
    public void attaqueBasiqueGuerrier(){
        Personnage guerrier = new Guerrier(3,1,1,1,1,"Guerrier");
        Personnage rodeur = new Rodeur(3,1,1,1,2,"Rôdeur");
        guerrier.attaqueBasique(rodeur);
        assertEquals(14,rodeur.getVie(),0);
        }
    @Test
    public void attaqueSpecialeGuerrierDmgAdv(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage rodeur = new Rodeur(6,2,2,2,2,"Rôdeur");
        guerrier.attaqueSpeciale(rodeur);
        assertEquals(26,rodeur.getVie(),0);
    }
    @Test
    public void attaqueSpecialeGuerrierDmgJou(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage rodeur = new Rodeur(6,2,2,2,2,"Rôdeur");
        guerrier.attaqueSpeciale(rodeur);
        assertEquals(26,rodeur.getVie(),0);
    }
    @Test
    public void attaqueBasiqueRodeur(){
        Personnage guerrier = new Guerrier(3,1,1,1,1,"Guerrier");
        Personnage rodeur = new Rodeur(3,1,1,1,2,"Rôdeur");
        rodeur.attaqueBasique(guerrier);
        assertEquals(14,guerrier.getVie(),0);
    }
    @Test
    public void attaqueSpecialeRodeur(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage rodeur = new Rodeur(6,2,2,2,2,"Rôdeur");
        rodeur.attaqueSpeciale(guerrier);
        assertEquals(5,rodeur.getAgilite(),0);
    }
    @Test
    public void attaqueBasiqueMage(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage mage = new Mage(6,2,2,2,2,"Mage");
        mage.attaqueBasique(guerrier);
        assertEquals(28,guerrier.getVie(),0);
    }
    @Test
    public void attaqueSpecialeMageRetourVieInitiale(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage mage = new Mage(6,2,2,2,2,"Mage");
        mage.setVie(29);
        mage.attaqueSpeciale(guerrier);
        assertEquals(30,mage.getVie(),0);
    }
    @Test
    public void attaqueSpecialeMage(){
        Personnage guerrier = new Guerrier(6,2,2,2,1,"Guerrier");
        Personnage mage = new Mage(6,2,2,2,2,"Mage");
        mage.setVie(15);
        mage.attaqueSpeciale(guerrier);
        assertEquals(19,mage.getVie(),0);
    }
}

