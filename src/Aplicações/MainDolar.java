/*
 Ler a cotação do dolar, depois ler o valor a ser comprado em reais. Informar quantos 
reais serão pagos pelo os dolares, considerando que a pessoa terá que pagar 6% de IOF
sobre o valor do dolar.
 */
package Aplicações;

import Entidades.Dolar;
import java.util.Locale;
import java.util.Scanner;

public class MainDolar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        System.out.print("Informe o valor do dólar: ");
        double dolar = scn.nextDouble();

        System.out.print("Quantos dólares deseja comprar? ");
        double quantidadeDolares = scn.nextDouble();

        System.out.printf("Valor total a ser pago pela quantidade de dólares é de %.2f%n",
                + Dolar.converterDolar(dolar, quantidadeDolares));
    }
}
