package Aplicacoes;

/**
 *
 * @author arils
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainsScnFile {

    public static void main(String[] args) {
        
    File file = new File("caminho do do arquivo");
    Scanner scn = null;

    
        try{
         scn = new Scanner(file);
        while (scn.hasNextLine()) {
            System.out.println(scn.nextLine());
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
        if(scn != null){
            scn.close();
        }
    }       
    }    
}

