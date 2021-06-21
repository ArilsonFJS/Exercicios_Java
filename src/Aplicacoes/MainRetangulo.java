/*
 Ler os valores da largura e altura de um retangulo. Em seguida, mostrar na tela 
o valor de sua área, perímetro e diagonal.
 */
package Aplicacoes;

import Entidades.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        System.out.print("Informe a altura e largura do retangulo: ");
        double h = scn.nextDouble();
        double b = scn.nextDouble();

        Retangulo retangulo = new Retangulo(h, b);

        System.out.println("Altura: " + retangulo.getH() + " Base: " + retangulo.getB());
        System.out.printf("Area: %.2f%n", retangulo.area());
        System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
        System.out.println("Quadrado? " + retangulo.isQuadrado(h, b));

    }
}
