package oliveto;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public abstract class Ulivo extends Observable{
   
    int matricola;
    private float ricavatoOlio;
    float produzioneOlive;
    float resa;
    MalattiaPianta mP=null;
    boolean isSick=false;
    float perditaOlive;
    
 
    String tipoColtivazione; //Bio NonBio
  
    
    public String ulivoSiAmmala(){
       perditaOlive= (int) Math.random()+50;
       perditaOlive=( this.produzioneOlive*perditaOlive)/100;
       mP=new MalattiaPianta();
       isSick=true;
      
       this.setChanged();
       this.notifyObservers();
       this.produzioneOlive-=perditaOlive;
       return mP.getNome();
  }
    
   public float olioRicavato (){
       
       perditaOlive=(produzioneOlive*resa)/100;
       ricavatoOlio=produzioneOlive-perditaOlive;
       return ricavatoOlio;
    }
   
     public void ulivoGuarisce(CuraMalattiaUlivo c){
       Pesticidi p=new Pesticidi();
       if(c.getClass()== p.getClass()){
           perditaOlive=5;
         }
       else{
           perditaOlive=10;
       }
    }
     
    public abstract String getVarietà(); // incrementare e decrementare numLeccini, numFrantoio, numMoraiolo ecc
    
    public String getMalattia(){
        return mP.getNome();
    }
    
    public String getDescMalattia(){
        return mP.getDesc();
    }
   

}