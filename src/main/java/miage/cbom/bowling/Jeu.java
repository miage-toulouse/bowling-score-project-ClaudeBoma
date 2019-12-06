package miage.cbom.bowling;

public class Jeu {
    private Integer lance1 ;
    private Integer lance2;

    public Jeu(Integer lance1, Integer lance2) {
        this.lance1 = lance1;
        this.lance2 = lance2;
    }
    public Jeu(Integer lance1) {
        this.lance1 = lance1;
    }

    public int nbQuillesTombees(){
        int nbQuilles = 0 ;
        if(!this.isStrike()){
            nbQuilles =  this.lance1 + this.lance2 ;
        }
        else{
            nbQuilles = this.lance1;
        }
        return nbQuilles;
    }

    public boolean isSpare(){
        boolean spare = false;
        if( !this.isStrike() && this.lance1+this.lance2 == 10 ){
            spare = true ;
        }
        return  spare;
    }

    public boolean isStrike(){
        boolean strike = false;
        if(this.lance2 == null){
            strike = true ;
        }
        return strike ;
    }

    public Integer  nbQuilleLance1() {
        return lance1;
    }


}
