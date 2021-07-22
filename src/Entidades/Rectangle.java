/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.Color;

/**
 *
 * @author arils
 */
public class Rectangle extends Shape {

    private double h;
    private double w;

    public Rectangle() {
        super();
    }

    public Rectangle(double w, double h, Color cor) {
        super(cor);
        this.h = h;
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double area() {
        return w * h;
    }

}
