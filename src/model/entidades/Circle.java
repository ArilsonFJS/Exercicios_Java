/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import Enum.Color;

/**
 *
 * @author arils
 */
public class Circle extends AbstractShape{

    private Double radius;

    public Circle(double area, Color color) {
        super(color);
        this.radius = area;
    }

    public double getArea() {
        return radius;
    }

    public void setArea(double area) {
        this.radius = area;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    } 
}
