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
public class CuraBiologicaTest {
    Ulivo ulivo;
    MalattiaPianta mP;
    CuraBiologica curaBio;
    
    
   
    
    @Before
    public void setUp() {
        CuraBiologica curaBio=new CuraBiologica();
        mP=new MalattiaPianta("-Tignola dell'olivo");
        ulivo.mP=mP;
    }
    
   

    @Test
    public void testCura() {
        String curaB=curaBio.cura(ulivo);
        assertEquals(curaBio, "bacillus thuringiensis");
        
    }
    
}