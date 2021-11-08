package oliveto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serja
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MalattiaPianta {
   private  String nome;
   private  String descrizione;
    
   MalattiaPianta(){
       int rand=setRand();
       this.nome=setMalattiaNome(rand);
       this.descrizione=setMalattiaDesc(rand+1);
       
   }

    MalattiaPianta(String nome){
        this.nome=nome;
        this.setMalattiaDesc(nome);
    }

    
    static int setRand(){
        int rand=0;
        try{
            Scanner scanner= new Scanner(new File("Malattie olivo.txt"));
            int countLines=0;
            while(scanner.hasNextLine()) {
                countLines++;
                scanner.nextLine();          
            }
            scanner.close();
            rand=(int)(Math.random()*countLines+1);
            if (rand%2==0){
                rand-=1;
            }
            
        }catch(FileNotFoundException e){
            System.out.println("file non trovato 01");
         }
            
        return rand;
    }
    
    static String setMalattiaNome(int random){
        String nome="";
        int indexLine=1;
        try{
            Scanner scannerNome=new Scanner(new File("Malattie olivo.txt"));
            while(indexLine!=random){
                scannerNome.nextLine();
                indexLine+=1;
            }
            nome=scannerNome.nextLine();
            scannerNome.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File non trovato 0");
        }
        return nome;
    }
    
    private String setMalattiaDesc(int random){
        int indexLine=1;
        String desc="";
        try{
            Scanner scannerDesc=new Scanner(new File("Malattie olivo.txt"));
            while(indexLine!=random){
                scannerDesc.nextLine();
                indexLine+=1;
            }
            desc=scannerDesc.nextLine();
            scannerDesc.close();
        }catch(FileNotFoundException e){
            System.out.println("File non trovato 1");
        }
        
        return desc;
    }
    
    private String setMalattiaDesc(String malattia){
        String desc="";
        try{
            Scanner scanner=new Scanner(new File("Malattie olivo.txt"));
            while(scanner.hasNextLine()){
                if(scanner.nextLine().equals(malattia)){
                    desc=scanner.nextLine();
                    break;
                }
                scanner.nextLine();
            }
            scanner.close();
        }catch(FileNotFoundException e){
        System.out.println("File non trovato 2");
        }
        return desc;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDesc(){
        return descrizione;
    }
}