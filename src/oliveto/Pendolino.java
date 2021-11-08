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
public class Pendolino extends Ulivo{
    
      public Pendolino(int matricola){
        this.matricola=matricola;
        this.resa=13;
        this.produzioneOlive=randOlive();
      
    }
    
    public int randOlive (){
        //int rand=(int)(1+Math.random()*5);
        int rand=1+(int)(Math.random()*5);
        System.out.println("PENDOLINO rand:"+" "+rand);
        return rand;
    }
    
    public String getVarietà(){
        return "P";
    }
    
     public int getMatricola(){
        return this.matricola;
    }
    
    public String getTipoColtivazione(){
        return this.tipoColtivazione;
    }
    
}
