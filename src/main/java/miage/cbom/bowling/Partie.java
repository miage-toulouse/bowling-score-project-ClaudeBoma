package miage.cbom.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux;

    public Partie(Jeu monJeu) {
        this.jeux = new ArrayList<>();
        for(int i=0; i<10; i++){
            this.jeux.add(monJeu);

            if (i==9 && monJeu.isSpare() ){
                this.jeux.add(monJeu);
            }
            if (i==9 && monJeu.isStrike() ){
                this.jeux.add(monJeu);
                this.jeux.add(monJeu);
            }
        }
    }




    public int calculeScore() {
        int score = 0;
        int tour = 9 ;
        for(int i=0;i<=tour;i++){
            Jeu jeu = jeux.get(i);
            score += jeux.get(i).nbQuillesTombees() ;
            if(jeu.isSpare())
            {
                Jeu nextJeu = jeux.get(i+1) ;
                score+= nextJeu.nbQuilleLance1();
            }
            else if(jeu.isStrike())
            {
                Jeu next2Jeu = jeux.get(i+2) ;
                Jeu next1Jeu = jeux.get(i+1) ;
                if(next1Jeu.isStrike()){
                    score+= next1Jeu.nbQuillesTombees() + next2Jeu.nbQuillesTombees() ;
                }
                else{
                    score+= next1Jeu.nbQuillesTombees();
                }

            }

        }
        return score;
    }
}
