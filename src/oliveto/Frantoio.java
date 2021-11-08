/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

/**
 *
 * @author serja
 */
public class Frantoio extends Ulivo {
    
      public Frantoio(int matricola){
        this.matricola=matricola;
        this.resa=18;
        this.produzioneOlive=randOlive();
      
    }
    
    public int randOlive (){
        int rand=22+(int)(Math.random()*(30-22+1));
        System.out.println("FRANTIO rand:" +rand);
        return rand;
    }
    
      @Override
    public String getVarietà(){
       return "F" ;
    }
    
    public int getMatricola(){
        return this.matricola;
    }
    
    public String getTipoColtivazione(){
        return this.tipoColtivazione;
    }
}
