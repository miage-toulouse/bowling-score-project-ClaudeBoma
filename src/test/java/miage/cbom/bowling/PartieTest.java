package miage.cbom.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    /*test les cans normaux d'abord , on ajoute la complexité de manière exprerimental
    * Clean Code => Bob Martin
    * Collaborateurs obligatoires faut les mettre dans le constructeur
    * */

    @Test
    public void testCalculeScoreSansStrikeSansSpare(){
        //given : etant donne une partie avec 10 jeux identiques faisant tombés 5 quilles sur les 2 lancés
        Jeu monJeu = new Jeu(5,0);
        Partie maPartie = new Partie(monJeu);


        //when : quand on calcule le score
        int score = maPartie.calculeScore();

        //then : on obtient le score de 50
        assertEquals(50,score);

    }

    @Test
    public void testCalculeScoreAvecQueDesSpare(){
        //given : etant donne une partie avec 10 jeux identiques faisant un spare 5,5 sur tous les lancés
        Jeu monJeu = new Jeu(5,5);
        Partie maPartie = new Partie(monJeu);


        //when : quand on calcule le score
        int score = maPartie.calculeScore();

        //then : on obtient le score de 150
        assertEquals(150,score);

    }


    @Test
    public void testCalculeScoreTousSptrike(){
        //given : etant donne une partie avec 10 jeux identiques faisant un strike 10,0 sur tous les lancés
        Jeu monJeu = new Jeu(10);
        Partie maPartie = new Partie(monJeu);

        //when : quand on calcule le score
        int score = maPartie.calculeScore();

        //then : on obtient le score de 300
        assertEquals(300,score);

    }

}