package Aplicacoes;

import Entidades.Reserva;
import excepetions.DomainException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author afrancelino
 */
public class MainReserva {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scn.nextInt();
            System.out.print("Check-In date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scn.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scn.next());

            Reserva reserva = new Reserva(number, checkIn, checkOut);
            System.out.println("Reservatio: " + reserva);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scn.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scn.next());

            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reservatio: " + reserva);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
