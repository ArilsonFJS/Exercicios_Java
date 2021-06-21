package Aplicacoes;

import Entidades.Departamento;
import Entidades.Trabalhador;
import Enum.NivelTrabalhador;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainTrabalhador {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Infome o nome do departamento: ");
        String nomeDepartamento = scn.nextLine();
        System.out.println();
        
        System.out.println("Informe os dados do trabalhador");
        System.out.print("Nome: ");
        String nomeTrabalhador = scn.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = scn.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = scn.nextDouble();
        
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
    }

}
