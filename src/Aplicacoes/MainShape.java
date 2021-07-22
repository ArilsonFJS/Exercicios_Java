/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacoes;

import Entidades.Circle;
import Entidades.Rectangle;
import Entidades.Shape;
import Enum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainShape {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number shapes: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = scn.next().charAt(0);
            System.out.println();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scn.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double w = scn.nextDouble();
                System.out.print("Heigth: ");
                double h = scn.nextDouble();
                
                list.add(new Rectangle(w, h, color));
                System.out.println();
            } else{
                System.out.print("Radius: ");
                double raio = scn.nextDouble(); 
                list.add(new Circle(raio, color));
            }
        }
        
        System.out.println();
        System.out.println("SHAPE AREAS");
        for(Shape shape : list){
            System.out.println(String.format("%.2f",  shape.area()));
        }
    }
}
