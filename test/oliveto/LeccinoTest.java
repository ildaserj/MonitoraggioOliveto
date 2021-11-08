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
public class LeccinoTest {
    Leccino l1;
  
    @Before
    public void setUp() {
         l1= new Leccino(1234);
    }
   
     @Test
    public void TestGetMatricola(){
        assertEquals(l1.getMatricola(), 1234);
    }
 
    
    @Test
    public void testGetVarietà() {
        String expResult = "L";
        String result = l1.getVarietà();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
 
    
}
