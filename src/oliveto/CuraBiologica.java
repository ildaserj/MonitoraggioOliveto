/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oliveto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author serja
 */
public class CuraBiologica implements CuraMalattiaUlivo {
   
    @Override
     public String cura (Ulivo ulivo){
        String desc="";
        try{
            Scanner scanner=new Scanner(new File("UliviBio.txt"));
            while(scanner.hasNextLine()){
                if(scanner.nextLine().equals(ulivo.getMalattia())){
                    desc=scanner.nextLine();
                    break;
                }
                scanner.nextLine();
            }
            scanner.close();
        }catch(FileNotFoundException e){
        System.out.println("File non trovato Bio");
        }
        ulivo.isSick=false;
        ulivo.ulivoGuarisce(this);
        System.out.println("curaBio: "+desc);
        return desc;
    }
    
}
