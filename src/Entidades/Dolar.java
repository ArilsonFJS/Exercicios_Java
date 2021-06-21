package Entidades;

public class Dolar {

    public static final double IOF = 6.0;

    public static double converterDolar(double dolar, double quantidadeDolares) {
        double valorConvertido = quantidadeDolares * dolar;
        double acrescimoIOF = (IOF * valorConvertido) / 100;
        return valorConvertido + acrescimoIOF;
    }
}
