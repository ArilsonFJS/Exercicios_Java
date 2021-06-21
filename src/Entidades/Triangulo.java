package Entidades;

/*
 Responsável pelos metodos do triangulo
 */
public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
