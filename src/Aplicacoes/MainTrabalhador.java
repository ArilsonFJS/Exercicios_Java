package Aplicacoes;

import Entidades.Departamento;
import Entidades.HoraContrato;
import Entidades.Trabalhador;
import Enum.NivelTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainTrabalhador {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Infome o nome do departamento: ");
        String nomeDepartamento = scn.nextLine();
        System.out.println();

        System.out.println("Informe os dados do trabalhador");
        System.out.print("Nome: ");
        String nomeTrabalhador = scn.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalhador = scn.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = scn.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
        System.out.println();
        
        System.out.print("Informe a quantidade de contratos do trabalhador: ");
        int n = scn.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato " + i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(scn.next());
            System.out.print("Valor por hora: ");
            double valorhora = scn.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = scn.nextInt();

            HoraContrato contrato = new HoraContrato(dataContrato, valorhora, horas);
            trabalhador.addContrato(contrato);//Associa o contrato estanciado com o trabalhador
            System.out.println();
        }

        System.out.println();
        System.out.print("Entre com mes e ano para calcular a renda (MM/yyyy): ");
        String mesEAno = scn.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println();
        System.out.println("Nome: " + trabalhador.getNome() 
                + "\nDepartamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Renda de " + mesEAno + ": " + String.format("%.2f",trabalhador.renda(ano, mes)));
    }
}
