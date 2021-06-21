/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
 */
package Aplicacoes;

import Entidades.Funcionario2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario2 {
    

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        List<Funcionario2> list = new ArrayList<>();

        System.out.print("Quantos funcionarios deseja registrar: ");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Funcionario " + (i + 1));
            System.out.print(" ID: ");
            Integer id = scn.nextInt();
            System.out.print("Nome: ");
            scn.nextLine();
            String nome = scn.nextLine();
            System.out.print("Salario: ");
            Double salario = scn.nextDouble();

            Funcionario2 funcionario = new Funcionario2(id, nome, salario);

            list.add(funcionario);
        }

        System.out.print("Qual ID do funcionario que terá o salario incrementado? ");
        int id = scn.nextInt();
        Funcionario2 funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        System.out.println();
        if (funcionario == null) {
            System.out.println("Este ID não existe!");
        }else {
            
            System.out.print("Entre com a porcentagem: ");
            double porcentagem = scn.nextDouble();
            funcionario.aumentoSalario(porcentagem);
            
        }
        System.out.println();
        System.out.println("Lista de funcionarios");
        System.out.println();
        for(Funcionario2 obj : list){
            System.out.println(obj);
        }
    }
    
}
