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
public class PesticidiTest {
    private Pesticidi pesticidi;
    private MalattiaPianta malattia;
    private Ulivo ulivo;
    
    @Before
    public void setUp() {
     
        pesticidi=new Pesticidi();
        malattia=new MalattiaPianta("-Lebbra");
        ulivo.mP=malattia;
    }
    
    @Test
    public void testCura() {
        String pest=pesticidi.cura(ulivo);
        assertEquals(pest, "rame");
        
    }
    
}
