/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.entidades.Pessoas;

/**
 *
 * @author arils
 */
public class MainOrdenaNomes {

    public static void main(String[] args) {
        
        List<Pessoas> list = new ArrayList<>();
        String path = "C:\\Nomes.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String pessoaCsv = br.readLine();
            
            while(pessoaCsv != null){
                String [] dividir = pessoaCsv.split(",");
                list.add(new Pessoas(dividir[0], Double.parseDouble(dividir[1])));
                pessoaCsv = br.readLine();
            }
            
            Collections.sort(list);
            
            for(Pessoas p : list){
                System.out.println(p.getNome() + ", " + String.format("%.2f", p.getSalario()));
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
