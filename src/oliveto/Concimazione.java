package oliveto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serja
 */
public class Concimazione {
    
    private final Campo c;
    
    public Concimazione(Campo c){
        this.c=c;
    }

    
    public void ConcimeAzoto( int N){
        int dosi=(c.MIN_AZOTO-N);
        c.suolo.setAzoto(dosi);
        System.out.println("riconcimato azoto -->"+dosi);
        
    
}
   public void ConcimeAnidrideFosforosa(int P) {
       int dosi=(c.MIN_FOSFORO-P);
       c.suolo.setFosforo(dosi);
        System.out.println("riconcimato fosforo-->"+dosi);
   }
   
   public void ConcimeOssidoDiPotassio(int K){
       int dosi=(c.MIN_POTASSIO-K);
       c.suolo.setPotasio(dosi);
        System.out.println("riconcimato potassio-->"+dosi);
   }
}
