/*
 Ler o nome do aluno e as três notas que ele teve nos três trimestre do ano 
(Primeiro trismeste vale 30, segundo e terceiro 35). Ao final mostrar qual nota 
do aluno no ano. Dizer também se o aluno foi aprovado (Passou) ou não (Reprovado)
e, em caso negativo, quantos pontos faltam para o aluno obter o minímo para ser
aprovado (60% da nota).
 */
package Aplicacoes;

import Entidades.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class MainAluno {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = scn.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = scn.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = scn.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = scn.nextDouble();

        System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("Reprovou");
            System.out.printf("Pontos faltante %.2f%n", aluno.pontosFaltantes());
        } else {
            System.out.println("Passou");
        }
    }
}
