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
public class Oliveto {

    public static void main(String[] args) throws NoEttariException {

        Leccino l1=new Leccino(1234);
        Frantoio f1=new Frantoio (1235);
        Moraiolo m1=new Moraiolo(1236);
        Pendolino p1=new Pendolino (1237);
        /*
        System.out.println("olivel1"+" "+l1.produzioneOlive);
        System.out.println("l1Malattia"+ l1.ulivoSiAmmala());
        int resal1=l1.resa;
        System.out.println("resal1"+" "+resal1);
        int olio= l1.ricavato();
        System.out.println("oliol1:"+" "+olio);
        
        System.out.println("olivem1"+" "+m1.produzioneOlive);
        System.out.println("m1 MAlattia "+ m1.ulivoSiAmmala());
        int resam1=m1.resa;
        System.out.println("resa m1"+" "+resam1);
        int oliom1=m1.ricavato();
        System.out.println("olio M1:"+" "+oliom1);
        */
        //Terreno t1=new Terreno();//crhjuenejneicn
        Campo c=new Campo(3,"bio");//nhjwedkw
        c.addUlivo(l1);
        MonitoraggioUlivo mL=new MonitoraggioUlivo(l1);
        
        c.addUlivo(p1);
        c.addUlivo(m1);
        c.addUlivo(f1);
        System.out.println("ntotULIVI-> "+c.numTotale +" numero Leccini: "+c.numLeccini+" numero Frantoio: "+c.numFrantoio +" numero Moraioli: "+ c.numMoraiolo+ " numero Pendolino: "+c.numPendolino);
        
        l1.ulivoSiAmmala();
        System.out.println("l1: "+l1.getMalattia()+"--> " +l1.getDescMalattia());
        mL.update(l1, mL);//biwnijwun
        mL.strategy.cura(l1);
        
        MonitoraggioUlivo mF=new MonitoraggioUlivo(f1);
        f1.ulivoSiAmmala();
        System.out.println("f1: "+f1.getMalattia()+"--> " +f1.getDescMalattia());
        mF.update(f1, mF); //tcjg
        mF.strategy.cura(f1);
        
        MonitoraggioTerreno mT= new MonitoraggioTerreno(c);
        System.out.println("min azoto "+c.MIN_AZOTO);
        System.out.println("min fosforo "+c.MIN_FOSFORO);
        System.out.println("min potassio "+c.MIN_POTASSIO);
        mT.update(c, mT);//ejcnfjei
        
        System.out.println("olio f1 :"+ f1.olioRicavato());
        System.out.println("olio l1 :"+ l1.olioRicavato());
        System.out.println("olio m1 :"+ m1.olioRicavato());
        System.out.println("olio p1 :"+ p1.olioRicavato());
        System.out.println("olio totale :"+ c.olioTotale());
        
        
        
        System.out.println("................................................");
        MonitoraggioUlivo mM=new MonitoraggioUlivo(m1);
        m1.ulivoSiAmmala();
         
        System.out.println("m1 : "+ m1.getMalattia()+"-->"+ m1.getDescMalattia());
       
        mM.update(m1,c);
        mM.strategy.cura(m1);
         
       
    }

}
