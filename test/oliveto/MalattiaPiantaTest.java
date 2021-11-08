/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author serja
 */
public class MalattiaPiantaTest {
    private MalattiaPianta malattia;
    
    private int countlines;
  
   
    @Before
    public void setUp() {
        this.countlines=0;
        malattia= new MalattiaPianta();
      
    }
  
    @Test
    public void testSetRand() throws FileNotFoundException {
        Scanner scannerRand = new Scanner(new File("Malattie olivo.txt"));
        while(scannerRand.hasNextLine()){
            countlines++;
            scannerRand.nextLine();
        }
        scannerRand.close();
        
        int rand = MalattiaPianta.setRand();
        assertTrue(rand >0 && rand <= countlines);
    }

    @Test
    public void testSetMalattiaNome() throws FileNotFoundException {
        String malattiaNameExpected= MalattiaPianta.setMalattiaNome(MalattiaPianta.setRand());
        assertTrue(findName(malattiaNameExpected));
    }
   
    @Test
    public void testGetNome() throws FileNotFoundException {
        assertTrue(findName(malattia.getNome()));
        
    }

    @Test
    public void testGetDesc() throws FileNotFoundException {
        assertTrue(findDesc(malattia.getDesc()));
    }
    
    private boolean findName(String malattiaNome) throws FileNotFoundException{
        boolean found = false;
        Scanner scannerName= new Scanner(new File("Malattie olivo.txt"));
        while(scannerName.hasNextLine() ){
            if (scannerName.nextLine().equals(malattiaNome)){
                 found=true;
                 break;        
            }
            scannerName.nextLine();
                    
        }
        scannerName.close();
        return found;
    }
    
    private boolean findDesc(String malattiaDesc) throws FileNotFoundException{
        boolean found = false;
        Scanner scanner = new Scanner (new File("Malattie olivo.txt"));
        while(scanner.hasNextLine()){
            if(scanner.nextLine().equals(malattiaDesc)) {
                found=true;
                break;
            }
        }
        scanner.close();
        return found;
        
    }
    
    
}
