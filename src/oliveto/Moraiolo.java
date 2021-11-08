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
public class Moraiolo extends Ulivo{
    
    
      public Moraiolo(int matricola){
        this.matricola=matricola;
        this.resa=18;
        this.produzioneOlive=randOlive();
     
    }
    
    public int randOlive (){
        
        
        int rand=10+(int)(Math.random()*(20-10+1));
        System.out.println("MORAIOLO rand:"+" "+rand);
        return rand;
    }
    
      @Override
    public String getVarietà(){
        return "M";
    }
    
     public int getMatricola(){
        return this.matricola;
    }
    
    public String getTipoColtivazione(){
        return this.tipoColtivazione;
    }
}
