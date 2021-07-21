package Aplicacoes;

import Entidades.Employee;
import Entidades.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class MainEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employer #" + i + " data:");
            System.out.println();
            System.out.print("Outsourced  (y/n)? ");
            char ch = scn.next().charAt(0);
            System.out.print("Name: ");
            scn.nextLine();
            String name = scn.nextLine();
            System.out.print("Hours: ");
            int hours = scn.nextInt();
            System.out.print("Value per hours: ");
            double valueHours = scn.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scn.nextDouble();
                list.add(new OutsourcedEmployee(additionalCharge, name, hours, valueHours));
            } else {
                list.add(new Employee(name, hours, valueHours));
            }
        }
        
        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp : list) {
            System.out.println(emp.getNome() + "  - $ " + String.format("%.2f", emp.payment()));
        }
    }
}
