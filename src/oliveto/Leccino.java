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
public class Leccino extends Ulivo {
    
    
    public Leccino(int matricola){
        this.matricola=matricola;
        this.resa=22;
        this.produzioneOlive=randOlive();
      
        
    }
    
    public int randOlive (){
       
        int rand=23+(int)(Math.random()*(35-23+1));
        System.out.println("LECCINO:"+" "+rand);
        return rand;
    }
    
    @Override
    public String getVarietà(){
       return "L"; 
    }
    
    public int getMatricola(){
        return this.matricola;
    }
    
    public String getTipoColtivazione(){
        return this.tipoColtivazione;
    }
}
