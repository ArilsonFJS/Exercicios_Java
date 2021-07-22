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
public abstract class Shape {

    private Color cor;

    public Shape() {
    }

    public Shape(Color cor) {
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public abstract double area();
}
