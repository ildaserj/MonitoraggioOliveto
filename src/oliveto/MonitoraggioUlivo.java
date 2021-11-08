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
public class MonitoraggioUlivo implements Observer{
    public Ulivo ulivo;
    public CuraMalattiaUlivo strategy;
    
    public MonitoraggioUlivo(Ulivo ulivo) {
        this.ulivo = ulivo;
        ulivo.addObserver(this);
        
    }

    @Override
    public void update(Observable o, Object o1) {
        if((ulivo.isSick) && (ulivo.tipoColtivazione.equals("bio"))){
            strategy= setStrategy(new CuraBiologica());
        }
            
        if((ulivo.isSick) && (ulivo.tipoColtivazione.equals("nobio"))){
            strategy= setStrategy(new Pesticidi());
        }    
    }
    
    private CuraMalattiaUlivo setStrategy(CuraMalattiaUlivo c){
        strategy=c;
        return c;
    }
    
    
}
