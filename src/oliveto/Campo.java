/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author serja
 */
public class Campo extends Observable {
    
   private final int ettari; //250 piante ad ettaro
   private ArrayList <Ulivo> ulivi;
   public static int numLeccini=0;
   public static int numFrantoio=0;
   public static int numMoraiolo=0;
   public static int numPendolino=0;
   public static int numTotale=0;
   public int produzioneOliotot=0;
   private final String tipoColtivazione; //bio o non bio
   
   
   
   public Terreno suolo;
   int minA;
   int maxA;
   int minF;
   int maxF;
   int minP;
   int maxP;
   public final int MIN_AZOTO;
   public final int MIN_FOSFORO;
   public final int MIN_POTASSIO;

   public boolean aggiungereAzoto=false;
   public boolean aggiungereFosforo=false;
   public boolean aggiungerePotassio=false;
 
   public final int MAX_NUM_PIANTE;
   
    public Campo(int ettari, String tC) {
        
        suolo=new Terreno();
        this.ettari=ettari;
        tipoColtivazione=tC;
        ulivi=new ArrayList <>();
        //suolo=new Terreno();
        MIN_AZOTO=50*ettari;
        MIN_FOSFORO=50*ettari;  
        MIN_POTASSIO=60*ettari;
        MAX_NUM_PIANTE=250*ettari;
        minA=10*ettari;
        maxA=90*ettari;
        minF=10*ettari;
        maxF=75*ettari;
        minP=20*ettari;
        maxP=120*ettari;
    }
    //
    //----------------------Add/Remove olivi--------------------------
    //
    public void addUlivo(Ulivo u) throws NoEttariException{
       if(numTotale < MAX_NUM_PIANTE){
           ulivi.add(u);
           u.tipoColtivazione=tipoColtivazione;
           numTotale++;
           String varietà=u.getVarietà();
           if(varietà.equals("F"))
               numFrantoio++;
           if(varietà.equals("L"))
               numLeccini++;
           if(varietà.equals("M"))
               numMoraiolo++;
           if(varietà.equals("P"))
               numPendolino++;
        }   
       else {
           throw new NoEttariException();
       }
    }
    
    public void removeUlivi(Ulivo u){
        
        ulivi.remove(u);
        numTotale--;
         String varietà=u.getVarietà();
           if(varietà.equals("F"))
               numFrantoio--;
           if(varietà.equals("L"))
               numLeccini--;
           if(varietà.equals("M"))
               numMoraiolo--;
           if(varietà.equals("P"))
               numPendolino--;
    }
    
    public void removeAllUlivi(){
        ulivi.clear();
        numTotale=0;
        numFrantoio=0;
        numMoraiolo=0;
        numPendolino=0;
    }
    
    public ArrayList<Ulivo> getUlivi(){
        return ulivi;
    }
    
    public int getNumUlivi(){
        return numTotale;
    }
    
    //
    //-----------------------------TERRENO-------------------------
    //
    public void analisiAzotoSuolo(){
        
        int azoto;
        azoto=suolo.analisiAzotoRand(minA,maxA);
        if(azoto<MIN_AZOTO)
            aggiungereAzoto=true;
         System.out.println("livello azoto: "+azoto);
            
    }
    
    public boolean aggiungereAzoto(){
        return aggiungereAzoto;
    }
    
    public void analisiFosforoSuolo(){
        
        int fosforo;
        fosforo=suolo.analisiFosforoRand(minF,maxF);
        if(fosforo<MIN_FOSFORO)
            aggiungereFosforo=true;
        
        System.out.println("livello Fosforo: "+fosforo);
    }
    
    public boolean aggiungereFosforo(){
        return aggiungereFosforo;
    }
    
    
    public void analisiPotassioSuolo(){
        
        int potassio;
        potassio=suolo.analisiPotassioRand(minP,maxP);
        if(potassio<MIN_POTASSIO)
            aggiungerePotassio=true;
        System.out.println("livello Potassio: "+potassio);
       
    }
    
    public boolean aggiungerePotassio(){
       return aggiungerePotassio;
    }


//----------------------------------OLIO-------------------------------------

    public float olioTotale (){
        float tot=0;
        int i=0;
      while( i < ulivi.size()){
          tot+=ulivi.get(i).olioRicavato();
          i++;
      }
      return tot;

    }

}