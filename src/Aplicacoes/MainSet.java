package Aplicacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import model.entidades.RegistroEntrada;

/**
 *
 * @author afrancelino
 */
public class MainSet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insira o caminho completo do arquivo");

        String arquivo = scn.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            Set<RegistroEntrada> set = new HashSet<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date momento = Date.from(Instant.parse(fields[1]));

                set.add(new RegistroEntrada(userName, momento));

                line = br.readLine();
            }
            System.out.println("Total de usuarios: " + set.size());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
