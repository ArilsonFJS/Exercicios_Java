/*
 Ler os dados de um funcionário (nome, salario bruto e imposto). Em seguida mostrar os dados 
do funcionário (nome e salario liquido). Em seguida, aumentar o salario do funcionario 
com base em uma porcentagem dada (somente o salario bruto serpa afetado pela porcetagem) e mostrar
novamente os dados do funcionário. 
 */
package Aplicações;

import Entidades.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario {
    
    

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = scn.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = scn.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = scn.nextDouble();

        System.out.println();
        System.out.printf("Funcionário: " + funcionario.nome + ", R$: %.2f%n", funcionario.salarioLiquido());
        
        System.out.println();
        System.out.print("Qual a porcentagem para o aumento de salário? ");
        double porcentagem = scn.nextDouble();
        funcionario.aumentoSalarial(porcentagem);
        
        System.out.println();
        System.out.printf("Dados atualizados: " 
                + funcionario.nome + ", R$ %.2f%n", funcionario.aumentoSalarial(porcentagem));
    }
    
}
