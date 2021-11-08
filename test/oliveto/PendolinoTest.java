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
public class PendolinoTest {
    Pendolino p;
    
    @Before
    public void setUp() {
        p = new Pendolino(1236);   
    }
    
    @Test
    public void testGetVarietà() {
         String expResult = "M";
         assertEquals(expResult, p.getVarietà());   
    }

    @Test
    public void testGetMatricola() {
         assertEquals(1236, p.getMatricola());
    }
}
