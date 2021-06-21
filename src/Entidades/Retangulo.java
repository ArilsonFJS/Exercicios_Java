package Entidades;

public class Retangulo {

    public double h;
    public double b;

    public Retangulo(double h, double b) {
        this.h = h;
        this.b = b;
    }

    public boolean isQuadrado(double h, double b) {

        return h == b;
    }

    public double area() {
        return b * h;
    }

    public double perimetro() {
        double p = 2 * (h + b);
        return p;
    }

    public double diagonal() {
        double d = Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2));
        return d;
    }

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }

}
