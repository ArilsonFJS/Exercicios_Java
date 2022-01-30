/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacoes;

import Enum.Color;
import model.entidades.AbstractShape;
import model.entidades.Circle;
import model.entidades.Rectangle;

/**
 *
 * @author arils
 */
public class MainShape2 {
    
    public static void main(String[] args) {
        
        AbstractShape s1 = new Circle(3.0, Color.RED);
        AbstractShape s2 = new Rectangle(3.0,4.0, Color.BLACK);
        
        System.out.println("Color circle: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println();
        System.out.println("Color rectagle: " + s2.getColor());
        System.out.println("Rectagle area: " + String.format("%.3f", s2.area()));
    }
}
