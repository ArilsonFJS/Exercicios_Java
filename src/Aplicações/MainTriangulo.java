package Aplicações;

/*
Este programa le os 3 lados de 2 triangulos diferentes, calcula as areas e mostra qual area é a maior
 */
import Entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class MainTriangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Informe os 3 lados do triangulo X: ");
        x.a = scn.nextDouble();
        x.b = scn.nextDouble();
        x.c = scn.nextDouble();

        System.out.println("Informe os 3 lados do triangulo Y: ");
        y.a = scn.nextDouble();
        y.b = scn.nextDouble();
        y.c = scn.nextDouble();

        double areaX = x.area();
        double areaY = x.area();

        System.out.printf("A área do triangulo X: %.2f%n", areaX);
        System.out.printf("A área do triangulo Y: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo X possui a maior área");
        } else {
            System.out.println("O triangulo Y possui a maior área");
        }

    }

}
