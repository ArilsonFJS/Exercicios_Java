/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacoes;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author afrancelino
 */
public class MainFolders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        //Exibir somente pastas
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //Exibir somente arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        //Criar subpastas 
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        //Acessar Informações dos arquivos
        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());
    }
}
