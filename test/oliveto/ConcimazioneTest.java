/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author serja
 */
public class ConcimazioneTest {
    
    Campo c;
    Concimazione concime;
    
    
    @Before
    public void setUp() {
         c=new Campo(3,"bio");
         c.suolo.setAzoto(45);
         c.suolo.setFosforo(149);
         c.suolo.setPotasio(16);
    }
    

    @Test
    public void testConcimeAzoto() {
        concime.ConcimeAzoto(c.suolo.getAzoto());
        assertEquals(c.suolo.getAzoto(),"150");
        
    }

    @Test
    public void testConcimeAnidrideFosforosa() {
          concime.ConcimeAnidrideFosforosa(c.suolo.getFosforo());
        assertEquals(c.suolo.getFosforo(),"150");
    }

    @Test
    public void testConcimeOssidoDiPotassio() {
          concime.ConcimeOssidoDiPotassio(c.suolo.getPotassio());
        assertEquals(c.suolo.getPotassio(),"180");
    }
    
}
