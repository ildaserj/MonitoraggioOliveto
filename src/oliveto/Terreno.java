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
public class Terreno {
    
    
    /*
    Azoto: è indispensabile per la vita delle piante ed è un elemento fondamentale della fertilizzazione. L’azoto consente lo sviluppo dell’attività vegetativa della pianta, 
    determina l’allungamento del tronco e dei rami, aumenta la produzione di foglie e frutti. Un eccesso di azoto indebolisce la struttura della pianta creando una relazione 
    sbilanciata tra le foglie e gli steli. Inoltre la pianta diventa meno resistente alle malattie.

    Fosforo: è un elemento importante nella composizione di DNA e RNA, dei regolatori degli scambi energetici (ATP & ADP) e delle sostanze di riserva in semi e bulbi. 
    Contribuisce alla formazione di gemme e radici, alla fioritura ed alla lignificazione. Una carenza di fosforo provoca: irrigidimento della pianta, crescita lenta, 
    riduzione della produttività, frutti più piccoli e minore espansione delle radici.

    Potassio: anche se non è un costituente di composti importanti, gioca un ruolo di rilievo in molte attività fisiologiche come il controllo del turgore cellulare e 
    dell’accumulo di carboidrati. Determina un aumento di dimensioni dei frutti e migliora il loro sapore, ha un effetto positivo sul colore e sulla fragranza dei fiori. 
    Il potassio rende anche le piante più resistenti alle malattie
  */  
   
    private int livelloAzoto;  //50-80 kg/ha
    private int livelloFosforo;  //50-60 kg/ha
    private int livelloPotassio;  //60-100 kg/ha  
    
    public Terreno(){
        livelloAzoto=55;
        livelloFosforo=61;
        livelloPotassio=71;    
    }
    
     public int analisiAzotoRand(int min,int max){    
        
        int rand=min+(int)(Math.random()*(max-min+1));
        livelloAzoto=rand;
        return livelloAzoto;
        
    }
            
     public int analisiFosforoRand(int min,int max){    
        
        int rand=min+(int)(Math.random()*(max-min+1));
        livelloFosforo=rand;
        return livelloFosforo;
        
    }
      public int analisiPotassioRand(int min,int max){    
        
        int rand=min+(int)(Math.random()*(max-min+1));
        livelloPotassio=rand;
        return livelloPotassio;
        
    }
     
     public int getAzoto(){
         
         return livelloAzoto;
     }
     
     public int getFosforo(){
         
         return livelloFosforo;
         
     }
    
     public int getPotassio(){
         
         return livelloPotassio;
     }
     
     public void setAzoto(int a){
         livelloAzoto+=a;
     }
     
     public void setFosforo(int a){
         livelloFosforo+=a;
         
     }
     
     public void setPotasio(int a){
         livelloPotassio+=a;
     }
}
