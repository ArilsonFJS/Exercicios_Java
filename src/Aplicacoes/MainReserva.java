package Aplicacoes;

import Entidades.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author afrancelino
 */
public class MainReserva {

    public static void main(String[] args) throws ParseException {

        Scanner scn = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scn.nextInt();
        System.out.print("Check-In date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scn.next());
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scn.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro in reservetion: Check-out date must be after check-in date ");
        } else {
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
        }
    }

}
