/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author serja
 */
public class MonitoraggioTerreno implements Observer {

    private Campo c;
    private Concimazione concime;
    
    public MonitoraggioTerreno(Campo c){
        this.c=c;
        c.addObserver(this);
        concime=new Concimazione(c);
    }
    
    @Override
    public void update(Observable o, Object o1) {
        
        c.analisiAzotoSuolo();
        c.analisiFosforoSuolo();
        c.analisiPotassioSuolo();
        if(c.aggiungereAzoto)
            concime.ConcimeAzoto(c.suolo.getAzoto());
        if(c.aggiungereFosforo)
            concime.ConcimeAnidrideFosforosa(c.suolo.getFosforo());
        if(c.aggiungerePotassio)
            concime.ConcimeOssidoDiPotassio(c.suolo.getPotassio());
    }
}
