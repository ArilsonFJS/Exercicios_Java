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
public class Rectangle extends AbstractShape{
    
    private Double width;
    private Double heigth;

    public Rectangle(Double width, Double heigth, Color color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double area() {
        
        return width* heigth;
    }
}
