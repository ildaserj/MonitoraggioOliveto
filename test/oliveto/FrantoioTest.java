/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author serja
 */
public class FrantoioTest {
    Frantoio f;
   
    @Before
    public void setUp() {
        f=new Frantoio(1235);
    }
    
    @Test
    public void TestGetMatricola(){
        assertEquals(f.getMatricola(), 1235);
    }
 
   
    @Test
    public void testGetVarietà() {
       
        String expResult = "F";
        String result = f.getVarietà();
        assertEquals(expResult, result);
    
    }
    
}
